package testProject.models;

public class Person {
    private  String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void speak(){    //--->Overriding (doctor class)---> This symbol is blue dot and red down arrow
        System.out.println("Person speaking");
    }

}
