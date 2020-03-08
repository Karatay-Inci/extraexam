package Aexam;

public class A16BreakContinue {
    public static void main(String[] args) {
        for (int i=0;  i<10;  i++){
            if ( i==3   ||  i==5){
                continue;
            }
            System.out.println("i="+i+"\n");
        }
        int j=0;
        while (j<10){
            if (j==3 || j==5){
                j++;
                continue;
            }
            System.out.println("j="+j);
            j++;
        }
    }
}
