package exam;

import java.util.Scanner;

public class A7InputVeriable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.print("a : ");
        a = scanner.nextInt();
        System.out.print("b : ");
        b = scanner.nextInt();

        System.out.println("Before : ");
        System.out.println("a :" + a + " b :" + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After : ");
        System.out.println("a :" + a + " b :" + b);

    }
}
