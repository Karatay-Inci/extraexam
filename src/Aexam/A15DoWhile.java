package Aexam;

import java.util.Scanner;

public class A15DoWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please Enter a number :");

        int number = scanner.nextInt();
        int total=0;

        do {
            total += number % 10;
            number = number / 10;        //for update number  1234--->  new number--->123
            System.out.println("Number :"+number);
             }while (number > 0);
        System.out.println("Addition of numbers :"+total);

        }
    }

