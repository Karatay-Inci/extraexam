package OCA;

public class A1Feb27 {
    public static void main(String[] args) {
        //System.out.println(5+8*2-3%2);


        int x=10, y=5;

        boolean w=true, z=false;

        x=w ? y++ : y--;  //     y-- never reads this one

        w =!z;      //  'z' is still false (nobody touch 'z')

        System.out.println("x="+x);
        System.out.println("y="+y);

        System.out.print((x+y)+" "+(z ? 5:10));
    }
}
