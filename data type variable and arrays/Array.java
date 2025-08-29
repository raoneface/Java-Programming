public class Array {
    public static void main(String[] args) {
        // One dimensional Array
        int[] subject_marks;
        subject_marks = new int[5];
        subject_marks[0] = 45;
        subject_marks[1] = 65;
        subject_marks[2] = 25;
        subject_marks[3] = 95;
        subject_marks[4] = 75;

        System.out.println(subject_marks[0]);
        System.out.println(subject_marks[1]);
        System.out.println(subject_marks[2]);
        System.out.println(subject_marks[3]);
        System.out.println(subject_marks[4]);

        String[] Weekdays = { "Monday", "Tuesday", "Wednessday", "Thusday", "Friday", "Saturday", "Sunday" };
        System.out.println(Weekdays[0]);
        System.out.println(Weekdays[1]);
        System.out.println(Weekdays[2]);
        System.out.println(Weekdays[3]);
        System.out.println(Weekdays[4]);
        System.out.println(Weekdays[5]);
        System.out.println(Weekdays[6]);

        // multidimensional array

        int[][] twod = new int[3][2];
        twod[0][0] = 10;
        twod[0][1] = 20;
        twod[1][0] = 30;
        twod[1][1] = 20;
        twod[2][0] = 33;
        twod[2][1] = 543;

        System.out.println(twod[0][0]);
        System.out.println(twod[0][1]);
        System.out.println(twod[1][0]);
        System.out.println(twod[1][1]);
        System.out.println(twod[2][0]);
        System.out.println(twod[2][1]);

        int twood[][] = new int[3][];

        twood[0] = new int[3];
        twood[1] = new int[2];
        twood[2] = new int[1];
        twood[0][0] = 11;
        twood[0][1] = 33;
        twood[0][2] = 24;
        twood[1][0] = 33;
        twood[1][1] = 133;
        twood[2][0] = 22;

        int twodarray[][] = { { 11, 2 },
                { 33, 4 },
                { 4, 4 } };
        System.out.println(twodarray[0][1]);
    }
}
