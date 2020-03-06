package exam;

public class A7NotOrAnd {
    public static void main(String[] args) {

        System.out.println(3!= 4 && 4>3 && "A" == "A") ;

        System.out.println(!(3!= 4 && 4>3 && "A" == "A")) ;

        System.out.println(3 == 4 || 4>3 || "A" == "B") ;

        System.out.println(3 == 4 || 2>3 || "A" == "B") ;

        System.out.println("!(5==5)" );

    }
}
