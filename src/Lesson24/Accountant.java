package Lesson24;

public class Accountant extends Employee {
   String licence;

    public Accountant(String name, int age, String gender, int experience, String licence) { //v etom kostruktore child klassa
        super(name, age, gender, experience);                               //vizivaetsja konstruktor parent klassa
        this.licence = licence;
    }

    public static void main(String[] args) {

        Accountant acc = new Accountant("Tatjana", 55, "Female", 30, "ACC");

        System.out.println("Name: " + acc.getName() +
                ", Age: " + acc.getAge() +
                ", Gender: " + acc.getGender() +
                ", Experience: " + acc.getExperience() +
                ", Licence: " + acc.licence);

        acc.Accepted();
    }
}
