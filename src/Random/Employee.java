package Random;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    public static void main(String[] args) {
        ArrayList <TestEmployee> list = new ArrayList<>();
        TestEmployee employee1 = new TestEmployee(1, "John Doe", 100.00);
        TestEmployee employee2 = new TestEmployee(5, "Jackie Chan ", 600.00);
        TestEmployee employee3 = new TestEmployee(3, "Shakira", 300.00);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before " + list);
        Collections.sort(list);
        System.out.println("After " + list);
    }

}

class TestEmployee implements Comparable <TestEmployee> {
    int id;
    String name;
    Double salary;

    public TestEmployee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TestEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(TestEmployee anotherEmp) {
        if (this.id == anotherEmp.id) { //ili vsju if else konstrukciju zamenitj toljko na return this.id - anotherEmp.id
            return 0;
        }
        else if (this.id < anotherEmp.id) {
            return -1;
        }
        else {
            return 1;
        }
    }
}