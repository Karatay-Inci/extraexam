package Aexam;
import java.util.Scanner;
public class A8IfElse4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your note:");
        int note = scanner.nextInt();

        if (note >=90){
            System.out.println("AA");
        }
         else if(note >=85){
            System.out.println("BA");
        }
        else if(note >=80){
            System.out.println("BB");
        }
        else if(note >=75){
            System.out.println("CB");
        }
        else if(note >=60){
            System.out.println("DD");
        }
        else {
            System.out.println("FAIL");
        }


    }
}
