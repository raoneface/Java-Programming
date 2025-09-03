public class Controlstatement {
    public static void main(String[] args) {
        // selection iteration and jump
        // two selection statement
        // if and switch

        // if (condition) statement1 ;
        // else statement2;

        int x = 10;
        if (x < 10)
            System.out.println("hello");
        else
            System.out.println("World");

        if (x < 10) {
            for (int i = 0; i < 9; i++) {
                System.out.println("hello world");
            }
        } else {
            System.out.println("do not do anythging ");
        }

        // print odd even or whole number
        int number = 22;
        if (number % 2 == 0) {
            System.out.println("number is even " + number);
        } else if (number % 2 != 0) {
            System.out.println("number is odd ");
        } else {
            System.out.println("Number is whole number");
        }
       
        for ( int i = 0 ; i < 3 ; i++){
        switch (i) {
            case 0:
            System.out.println(0);
                break;
            case 1:
            System.out.println(1);
                break;
            case 2:
            System.out.println(2);
                break;
            default:
            System.out.println("default");

        }
    }
    }
}
