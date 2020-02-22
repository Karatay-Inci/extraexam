package exam;

import java.util.Scanner;

public class A7Input4BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight :");
        int weight = scanner.nextInt();

        System.out.println("Please enter your height :(ex: 1.72)");
        double height = scanner.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("Body mass index:"+bmi);
    }
}
