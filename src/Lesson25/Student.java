package Lesson25;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo () {
        System.out.println("Name: " + getName()
        + " Course: " + getCourse()
        + " Grade: " + getGrade());
    }
}
