class Box {
    double width;
    double height;
    double depth;
}

class Asimpleclass {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.height=10;
        mybox.width=20;
        mybox.depth=20;
        vol = mybox.height * mybox.depth * mybox.width;
        System.out.println("Vloume is "+ vol);
    }
}