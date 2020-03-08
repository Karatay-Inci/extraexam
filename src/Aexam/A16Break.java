package Aexam;

public class A16Break {
    public static void main(String[] args) {
        int i=0;

        while(i<20){

            System.out.println("i="+i+"\n");
            i++;
        }
        int j=0;

        while(j<20){
            if (j==10){
                break;
            }
            System.out.println("j="+j);
            j++;
        }

    }
}
