// adding a method  to a box class

class Box {
    double height;
    double width;
    double depth;
    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1;
        mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.depth = 20;
        mybox1.height = 20;
        mybox1.width = 20;
        mybox2.depth=20;
        mybox2.width=20;
        mybox2.height=10;
        mybox1.volume();
        mybox2.volume();

        
    }
}