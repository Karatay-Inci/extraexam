package exam;

import java.util.Scanner;

public class A8IfElse1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your age : ");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("You can not buy.");
            }

                System.out.println("Please write a number : ");
                int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Negatif");
                }
            }
        }

