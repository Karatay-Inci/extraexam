package Aexam;

import java.util.Scanner;

public class A7InputHipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("edge1 :");
    a = scanner.nextInt();
        System.out.print("edge2 :");
    b = scanner.nextInt();

    double hipotenus = Math.sqrt(a*a + b*b);
        System.out.println("hipotenus =" + hipotenus);
    }
}
