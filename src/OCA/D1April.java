package OCA;

public class D1April {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");      //----> This is garbage collection 
        two = new String("b");
        one = two;
        String three = one;
        System.out.println(one);

        one = null;
        System.out.println(one);
    }
}
