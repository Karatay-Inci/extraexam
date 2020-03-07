package Aexam;

import java.util.Scanner;

public class A14WhileFor {
    public static void main(String[] args) {

        /*  EX:   int i = 9;

        while (i<100){

            System.out.println("i = "+i);

            i +=3;
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number :");
        int number = scanner.nextInt();
        int factorial = 1;
        while (number>0){
            factorial *=number;
            number--;
        }
        System.out.println("Factorial = " + factorial);
        }
    }
