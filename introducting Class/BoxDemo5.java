// Adding a method that Takes Parameters
class Box {
    double height;
    double width;
    double depth;
    double volume() {
        return height * width * depth;
    }
    void setDim(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double volume;
        mybox1.setDim(3, 4, 5);
        volume = mybox1.volume();
        System.out.println("volume is " + volume);
        mybox2.depth = 12;
        mybox2.height = 32;
        mybox2.width = 32;
        volume = mybox2.volume();
        System.out.println("volume is " + volume);
    }
}