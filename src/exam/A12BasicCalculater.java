package exam;
import java.util.Scanner;
public class A12BasicCalculater {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("*****************************************");
        String operations = "1.Add\n"
                            + "2.Sub\n"
                            + "3.Multi\n"
                            + "4.Div\n";
        System.out.println(operations);
        System.out.println("*****************************************");
        System.out.print("Please Chose an operation:");
        String operation = scanner.nextLine();
    int a;
    int b;
        switch (operation){
            case "1.":
                System.out.print("1. Number :");
                 a = scanner.nextInt();
                System.out.print("2. Number :" );
                 b = scanner.nextInt();
                System.out.println("Add :" + (a+b));
                break;
            case "2.":
                System.out.print("1. Number :");
                a = scanner.nextInt();
                System.out.print("2. Number :" );
                b = scanner.nextInt();
                System.out.println("Sub :" + (a-b));
                break;
            case "3.":
                System.out.print("1. Number :");
                a = scanner.nextInt();
                System.out.print("2. Number :" );
                b = scanner.nextInt();
                System.out.println("Multi :" + (a*b));
                break;
            case "4.":
                System.out.print("1. Number :");
                a = scanner.nextInt();
                System.out.print("2. Number :" );
                b = scanner.nextInt();
                System.out.println("Div :" + ((double)a/b));
                break;
            default:
                System.out.println("Invalid");




        }

    }
}
