package Lesson24;

public class Accountant extends Employee {
   String licence;

    public Accountant(String name, int age, String gender, int experience, String licence) { //v etom kostruktore child klassa
        super(name, age, gender, experience);                               //vizivaetsja konstruktor parent klassa
        this.licence = licence;
    }

    public void Accepted() {
        System.out.println("Accountant was accepted");
    }

    public void showInfo () {
        System.out.println("Name: " + getName()
                + " Age: " + getAge()
                + " Gender: " + getGender()
                + " Experience: " + getExperience()
                + " Licence: " + licence);
    }

    public static void main(String[] args) {

        Accountant acc = new Accountant("Tatjana", 55, "Female", 30, "ACC");

        acc.showInfo();
        acc.Accepted();

    }
}
