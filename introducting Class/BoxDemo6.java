class Box {
    double height;
    double width;
    double depth;
    double volume() {
        return height * width * depth;
    }
    Box() {
        System.out.println("Constructor for Box");
        width = 10;
        height = 20;
        depth = 30;
    }
    Box(double depth, double width , double height){
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of box " + vol);
        Box mybox2 = new Box(1,2,3);
        vol=mybox2.volume();        
        System.out.println("volume of box "+ vol);
    }
}