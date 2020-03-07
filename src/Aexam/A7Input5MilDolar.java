package Aexam;

import java.util.Scanner;

public class A7Input5MilDolar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("How much dollar does your car burn in a mil ? : ");
        double dollar = scanner.nextDouble();

        System.out.print("How many mil did you go ?:");
        int mil = scanner.nextInt();

        System.out.println("Total : " + (dollar*mil) + "$");
    }
}
