package OCA;

public class C3Varargs {
    public static void main(String... args) {
        int[] a = {2323,4545,5545};
        printNumber(a);
        printNumber(1,2,3,3);
        printNumber(4);
        printNumber();
            //varargs = Variable arguments
    }
    public static void printNumber(int... numbers){
        //int []someArr={2323,4545,5545};
        //int []someArr= {1,2,3,3};
        //int []someArr= {4};
        int []someArr= new int[0];

        for (int i:numbers){
            System.out.println(i);
        }
    }
    public static void calculate (String name, int number , String... cityNames){
//  public static void calculate (String name, String... cityNames,int number)-----> do not write /varargs must be end part.
    }
}
