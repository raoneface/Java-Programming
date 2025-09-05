// Returning a value
class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol ;
        mybox1.depth=10;
        mybox1.height=20;
        mybox1.width=15;

        mybox2.depth=10;
        mybox2.height=203;
        mybox2.width=12;

        // get volume first
        vol = mybox1.volume() ;
        System.out.println("volume is "+ vol);

        //get volume second
        vol = mybox2.volume();
        System.out.println("volume is "+ vol);
    

    }
}
