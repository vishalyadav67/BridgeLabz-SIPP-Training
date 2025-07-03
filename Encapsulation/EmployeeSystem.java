abstract class Employee{
	private int EmployeeID;
	private String EmployeeName;
	private double  BaseSalary;
	
	public Employee(int EmployeeID, String EmployeeName, double BaseSalary) {
		this.EmployeeID = EmployeeID;
		this.EmployeeName = EmployeeName;
		this.BaseSalary = BaseSalary;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public double getBaseSalary() {
		return BaseSalary;
	}
	public abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println("ID: " + EmployeeID);
        System.out.println("Name: " + EmployeeName);
        System.out.println("Base Salary: " + BaseSalary);
	}
	
}
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);  // baseSalary is not used
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}


public class EmployeeSystem {
	public static void main(String args[]) {
		FullTimeEmployee emp1 = new FullTimeEmployee(101, "Ananya", 40000, 8000);
        emp1.assignDepartment("HR");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Ravi", 500, 40);
        emp2.assignDepartment("Support");

        
        System.out.println("--- Employee 1 ---");
        emp1.displayDetails();
        System.out.println("Total Salary: ₹" + emp1.calculateSalary());
        System.out.println(emp1.getDepartmentDetails());

        
        System.out.println("--- Employee 2 ---");
        emp2.displayDetails();
        System.out.println("Total Salary: ₹" + emp2.calculateSalary());
        System.out.println(emp2.getDepartmentDetails());
	}
}
