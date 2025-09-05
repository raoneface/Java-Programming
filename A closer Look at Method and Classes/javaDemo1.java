
class OverloadDemo {
    // Demonstrate method overloading
    void test() {
        System.out.println("No parameters ");
    }

    // Overload test for one integer parameter
    void test(int a) {
        System.out.println("a : " + a);
    }

    // Overload test for two integer parameter
    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    // Overload test for double paramter
    double  test(double a){
        System.out.println("double a : "+ a);
        return a * a;
    } 
}

public class javaDemo1 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        // call all version of test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.45);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
