class Box {
    double width;
    double height;
    double depth;
}

public class Boxdemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.height=10;
        mybox1.width=20;
        mybox1.depth=20;
        vol = mybox1.height * mybox1.depth * mybox1.width;
        System.out.println("Vloume is "+ vol);

        mybox2.height=10;
        mybox2.width=20;
        mybox2.depth=20;
        vol = mybox2.height * mybox2.depth * mybox2.width;
        System.out.println("Vloume is "+ vol);

    }
}