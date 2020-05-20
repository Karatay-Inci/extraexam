package testProject.models;

public class Doctor extends Person{

    private String specialty;

    public Doctor(String name, String specialty){
        super(name);
        this.specialty = specialty;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public String toString(){
        return "Hello.I am doctor"+getName();
    }
    public void speak(){    //--->Overriding (person class)--->This symbol is dot and red up arrow
        System.out.println("doctor "+getName()+" speaking");
    }
    //overloading method here
    public void speak(String name){
        System.out.println(name+"doctor speaking");
    }
}
