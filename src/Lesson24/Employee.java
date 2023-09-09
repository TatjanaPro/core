package Lesson24;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private int experience;

    public Employee(String name, int age, String gender, int experience) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
    }

    public void showInfo () {
        System.out.println("Name: " + getName()
                + " Age: " + getAge()
                + " Gender: " + getGender()
                + " Experience: " + getExperience());
    }

    public void Accepted() {
        System.out.println("Employee was accepted");
    }

    public void Fired() {
        System.out.println("Employee was fired");
    }

    public void Retired() {
        System.out.println("Employee was retired");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getExperience() {
        return experience;
    }

}
