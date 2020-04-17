package OCA;

import jdk.swing.interop.SwingInterOpUtils;

public class C2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int arr1 [] ={1,2,3};
        int [] arr2 = new int [] {1,2,3,4};
        int [] arr3 = new int [3];
        int [] arr4 = {1,2,3,4};


        int [][] arr5 = {{1,2,3},{4,5,6}};
        int arr6 [][] ={{1,2,3},{4,5,6}};
        int [][] arr7 = new int [] []{{1,2,3},{4,5,6}};
        int [][] arr8 = new int [3][3];
        int [][] arr9 = {{1,2,3},{4,5,6}};

        System.out.println("arr6="+arr6[0][1]);


    }
}
