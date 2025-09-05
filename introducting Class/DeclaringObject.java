class box {
    double height;
    double width;
    double depth;
}
public class DeclaringObject {
    public static void main(String[] args) {
        double vol;
        box mybox1; // declare reference to object
        mybox1 = new box(); // allocate a Box object;
        mybox1.depth=10;
        mybox1.height=20;
        mybox1.width=30;
        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("volume is " + vol);
        box mybox2 = mybox1;
        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("volume is "+ vol);
  //      mybox1 and mybox2 is refering same object
  
  
    }
}
