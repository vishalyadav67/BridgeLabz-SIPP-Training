import java.util.ArrayList;
import java.util.List;

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    class Department {
        private String deptName;
        private List<Employee> employees;

        public Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }

        class Employee {
            private String empName;

            public Employee(String empName) {
                this.empName = empName;
            }

            public void display() {
                System.out.println("    Employee: " + empName);
            }
        }

        public void addEmployee(String name) {
            employees.add(new Employee(name));
        }

        public void displayDepartment() {
            System.out.println("  Department: " + deptName);
            for (Employee emp : employees) {
                emp.display();
            }
        }
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}
public class CompanyComposition {
    public static void main(String[] args) {
      
        Company myCompany = new Company("TechVision Pvt. Ltd.");

        Company.Department devDept = myCompany.addDepartment("Development");
        devDept.addEmployee("Alice");
        devDept.addEmployee("Bob");

        Company.Department hrDept = myCompany.addDepartment("Human Resources");
        hrDept.addEmployee("Charlie");

        myCompany.displayCompany();

        myCompany = null;
        System.gc();  

        System.out.println("\nCompany and its contents are now deleted (eligible for GC).");
    }
}
