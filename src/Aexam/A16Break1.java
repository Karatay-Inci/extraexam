package Aexam;

import java.util.Scanner;

public class A16Break1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int process=scanner.nextInt();
            if(process==-1){
                System.out.println("Process is ending....");
                break;
            }
            System.out.println("Process:"+process);
        }
    }
}
