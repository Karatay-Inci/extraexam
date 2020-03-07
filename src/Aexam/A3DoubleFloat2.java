package Aexam;
public class A3DoubleFloat2 {
    public static void main(String[] args) {
        int a = 5;
        float b = a;
        System.out.println(b);

        int c = 6;
        double d = c;
        System.out.println("d = " +d);

        //cicrle        int--->float--->double
        // This is wrong -->   double i = 3.52;
        //                     float j = i;                 down is true

        double i = 3.52;
        float j = (float) i;
        System.out.println("j = " +j);

        double no1 = 70.25;
        double no2 = 60d;
        double no3 = 80.2;
        System.out.println("Average =" +(no1+no2+no3) / 3);

        float nu1 = 70.25f;
        float nu2 = 60f;
        float nu3 = 80.2f;
        System.out.println("Average =" +(nu1+nu2+nu3) / 3);

    }
}
