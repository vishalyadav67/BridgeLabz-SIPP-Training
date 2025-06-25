class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        
    }
}

class Manager extends Employee {
    String level;

    Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    void displayManagerDetails() {
        System.out.println("Manager ID   : " + employeeID);
        System.out.println("Department   : " + department);
        System.out.println("Level        : " + level);
        System.out.println("Salary       : " + getSalary());
        
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "Sales", 40000);
        emp1.displayEmployeeDetails();

        emp1.setSalary(45000);
        emp1.displayEmployeeDetails();

        Manager mgr1 = new Manager(2001, "IT", 70000, "Senior");
        mgr1.displayManagerDetails();
    }
}
