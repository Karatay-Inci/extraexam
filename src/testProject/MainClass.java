package testProject;

import testProject.models.Doctor;
import testProject.models.Person;

public class MainClass {
    public static void main(String[] args) {
        Person joe = new Person("joe");
        Person diana = new Doctor("diana","pediatric");
        Doctor ana =new Doctor("ana","eye");

        joe.speak();
        diana.speak();
        ana.speak();


    }
}
