package exam;
import java.util.Scanner;
public class A13ForFactorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number :");
    int factorial = 1;
    int number = scanner.nextInt();
    for (int i = 1;     i<=number;      i++){
        factorial *=i;
        System.out.println("Factorial = "+ factorial + "i = "+i);
    }
        System.out.println("Factorial = "+factorial);
}

}
