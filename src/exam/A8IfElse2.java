package exam;
import java.util.Scanner;
public class A8IfElse2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a no : ");
        int no = scanner.nextInt();
        if (no < 0) {
            System.out.println("Negatif");

        }
        else {
            System.out.println("pozitif or 0");
        }
    }
}
