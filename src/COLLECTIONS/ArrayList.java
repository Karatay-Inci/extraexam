package COLLECTIONS;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
       // ArrayList arrayList = new ArrayList<String >();
        List<String > list = new java.util.ArrayList<String >();

        //add element
        list.add("JAva");
        list.add("Python");
        list.add("C++");

        //fetch element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
     //   System.out.println(list.get(4)); //Exception because have not index 4

        System.out.println("*****************************************");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*****************************************");

        for (String s : list){
            System.out.println(s);
        }
        System.out.println("*****************************************");

        list.remove("C++");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("*****************************************");

        list.remove(1);
        for (String s : list){
            System.out.println(s);
        }



    }
}
