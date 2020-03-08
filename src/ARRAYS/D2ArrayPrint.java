package ARRAYS;

public class D2ArrayPrint {


    public static void printArray(int[] array){

        for (int i=0;  i<array.length;  i++){
            System.out.println("Element "+(i+1)+" : "+array[i]);
        }
    }

    public static double average(int[] array){

        int sum = 0;
        for (int i=0;  i<array.length;   i++){
            sum +=array[i];
        }
        return ((double) sum/array.length);
    }

    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = {12,13,14,15,16,17};
        printArray(b);
        System.out.println("Average :"+average(b));
    }

}
