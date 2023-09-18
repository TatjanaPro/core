package Lambda.homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class TestEmployee {
    public void printEmployee(Employee employee) {
        System.out.println("Name: " + employee.getName()
                + " Department: " + employee.getDepartment()
                + " Salary: " + employee.getSalary());
    }
    public void employeeFiltration (ArrayList<Employee> emplList, Predicate<Employee> employeePredicate) {
        for (Employee empl : emplList) {
            if (employeePredicate.test(empl)) {
                printEmployee(empl);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee empOne = new Employee("Lufi", "Sales department", 550.00);
        Employee empTwo = new Employee("Zorro", "Swords department", 300.00);
        Employee empThree = new Employee("Nanami", "Navigation department", 350.00);

        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);

        TestEmployee testEmployee = new TestEmployee();

        testEmployee.employeeFiltration(list, (Employee emp) -> {return emp.getDepartment().equals("Sales department") && emp.getSalary() > 300;});
        testEmployee.employeeFiltration(list, (Employee emp) -> {return emp.getName().startsWith("Z") && emp.getSalary() != 550;});
    }
}