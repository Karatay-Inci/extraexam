package exam;
import java.util.Scanner;
public class A8IfElse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number :");

        int a = scanner.nextInt();
        if (a == 1){
            System.out.println("Part 1");
        }
        if (a == 2){
            System.out.println("Part 2");
        }
        if (a == 3){
            System.out.println("Part 3");
        }
        else {
            System.out.println("This number is wrong.");
        }
    }
}
