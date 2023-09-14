package Lambda;

import java.util.ArrayList;

public class Example {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo {
    void printStudent (Student student) {
        System.out.println("Name: " + student.name
                + " Sex: " + student.sex
                + " Age: " + student.age
                + " Course: " + student.course
                + " Average grade: " + student.avgGrade);
    }
    void testStudents (ArrayList<Student> studentList, StudentChecks studentChecks) { //metod prinimaet kak parametri arraylist i objekt tipa dannih interfejsa StudentChecks
        for (Student s : studentList) { //peremenaja tipa Students : nazvanie arrayLista
            if (studentChecks.test(s)) { // etot student podhodit pod uslovija filjtracii objekta studentChecks (smotrit filjtr v interfejse)
                printStudent(s); //esli podhodit, to vivodim na ekran etogo studenta
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student studentOne = new Student("Dom Perignon", 'M', 102, 5, 10);
        Student studentTwo = new Student("Gintoki Sakata", 'M', 27, 5, 9);
        Student studentThree = new Student("Kagura", 'F', 14, 1, 4);
        Student studentFour = new Student("Shinpachi Shimura", 'M', 16, 2, 8);
        list.add(studentOne);
        list.add(studentTwo);
        list.add(studentThree);
        list.add(studentFour);

        StudentInfo studentInfo = new StudentInfo();

       /* FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
        FindStudentsUnderGrade findStudentsUnderGrade = new FindStudentsUnderGrade();
        FindStudentsOverAge findStudentsOverAge = new FindStudentsOverAge();
        FindStudentsUnderAge findStudentsUnderAge = new FindStudentsUnderAge();
        FindStudentsBySex findStudentsBySex = new FindStudentsBySex();
        FindStudentsMultiConditions findStudentsMultiConditions = new FindStudentsMultiConditions();

        studentInfo.testStudents(list, findStudentsOverGrade);
        System.out.println("--------------------------------------------------");
        studentInfo.testStudents(list, findStudentsUnderGrade);
        System.out.println("--------------------------------------------------");
        studentInfo.testStudents(list, findStudentsOverAge);
        System.out.println("--------------------------------------------------");
        studentInfo.testStudents(list, findStudentsUnderAge);
        System.out.println("--------------------------------------------------");
        studentInfo.testStudents(list, findStudentsBySex);
        System.out.println("--------------------------------------------------");
        studentInfo.testStudents(list, findStudentsMultiConditions); */

        //lamda pozvoljaet ne sozdavatj klassi, kotorie implementirujut interfejs i perepisivaet metod test v interfejse
        studentInfo.testStudents(list, (Student st) -> {return st.avgGrade > 9;}); //Student st - eto parametr metoda test iz interfejsa,
        System.out.println("--------------------------------------------------");
    }
}

interface StudentChecks {
    boolean test(Student s);
}
/*class FindStudentsOverGrade implements StudentChecks {
    public boolean test(Student s) {
        return s.avgGrade > 9;
    }
}
class FindStudentsUnderGrade implements StudentChecks {
    public boolean test(Student s) {
        return s.avgGrade < 9;
    }
}
class FindStudentsOverAge implements StudentChecks {
    public boolean test(Student s) {
        return s.age > 18;
    }
}
class FindStudentsUnderAge implements StudentChecks {
    public boolean test(Student s) {
        return s.age < 18;
    }
}
class FindStudentsBySex implements StudentChecks {
    public boolean test(Student s) {
        return s.sex == 'M';
    }
}
class FindStudentsMultiConditions implements StudentChecks {
    public boolean test(Student s) {
        return (s.avgGrade > 7 && s.age < 20 && s.sex == 'M');
    }
}*/