package exam;
import java.util.Scanner;
public class A11BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight :");
        int weight = scanner.nextInt();

        System.out.print("Please enter your height (ex: 1.72) :");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Thin");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Fat");
        } else {
            System.out.println("obez");
        }
    }
}



