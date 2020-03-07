package Aexam;

import java.util.Scanner;

public class A9SwitchCaseBreak {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int process = scanner.nextInt();
    switch (process) {
        case  1:
            System.out.println("1.process");
            break;
        case  2:
            System.out.println("2.process");
            break;
        case  3:
            System.out.println("3.process");
            break;
        case  4:
            System.out.println("4.process");
            break;
        default:
            System.out.println("Invalid!");
    }
    }
}
