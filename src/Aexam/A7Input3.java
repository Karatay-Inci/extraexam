package Aexam;

import java.util.Scanner;

public class A7Input3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age and name :" );
        int age = scanner.nextInt();
        scanner.nextLine();  //basic
        String name = scanner.nextLine();
        System.out.println("Age : " + age);
        System.out.println("Name : "+ name);
    }
}
