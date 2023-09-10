package w3resource;

public class Employee {
    private int salary;
    public Employee (int salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("This is Employee");
    }
    public int getSalary() {
        return salary;
    }
}
class HRManager extends Employee {
    public HRManager (int salary) {
        super(salary);
    }
    @Override
    public void work() {
        System.out.println("This is HR");
    }
    public void addEmployee() {
        System.out.println("New employee added");
    }
}

class Main4 {
    public static void main(String[] args) {
        Employee employee = new Employee(200);
        HRManager hrManager = new HRManager(300);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());
        hrManager.work();
       hrManager.getSalary(); //tak ne rabotaet, tk nichego ne delaju s return value. Nado sout, togda metod retrive salary i converts v string
        hrManager.addEmployee();
    }
}