package exam;
import java.util.Scanner;
public class A10FindMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1 :");
        int a = scanner.nextInt();
        System.out.print("Number 2 :");
        int b = scanner.nextInt();
        System.out.print("Number 3 :");
        int c = scanner.nextInt();
         int max = -1;
         if (a>=b && a>=c){
             max = a;
         }
        else if (b>=a && b>=c){
            max = b;
         }
        else {
        max = c;
        }
        System.out.println("max number : "+ max);
    }
}
