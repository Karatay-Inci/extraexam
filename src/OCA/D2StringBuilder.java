package OCA;

public class D2StringBuilder {
    public static void main(String[] args) {
        String name = "Jane";
        name = name + " Adams";
        System.out.println(name);

        StringBuilder sb = new StringBuilder("robert");
        sb.append("jenifer");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("robert ");
        System.out.println(sb1.indexOf("b"));

        StringBuilder sb2 = new StringBuilder("robert");
        System.out.println(sb2.length());

        StringBuilder sb3 = new StringBuilder("robert");
        System.out.println(sb3.substring(0));
        System.out.println(sb3.substring(1));
        System.out.println(sb3.substring(2));
        System.out.println(sb3.substring(3));
        System.out.println(sb3.substring(4));
        System.out.println(sb3.substring(5));
        System.out.println(sb3.substring(6));

        StringBuilder sb4 = new StringBuilder("robert");
        sb4.insert(2,"Z");
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("robert");
        sb5.delete(0,3);
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("robert");
        sb6.deleteCharAt(3);
        System.out.println(sb6);

        /* reverse -->the long way down
        String str = "inci";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i)); }*/

        StringBuilder sb7 = new StringBuilder("inci");
        System.out.println(sb7.reverse());          // OR   sb7.reverse();       System.out.println(sb7);
    }
}
