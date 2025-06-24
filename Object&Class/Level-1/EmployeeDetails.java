class Employee{
	String Employee_name;
	long Employee_id;
	double Salary;
	
	Employee(String Employee_name,long Employee_id,double Salary ){
		this.Employee_name = Employee_name;
		this.Employee_id = Employee_id;
		this.Salary = Salary;
	}
	void DisplayEmpolyeeDetails(){
		System.out.println("Employee-name: "+Employee_name+" Employee-id "+ Employee_id+ " Salary "+Salary);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("aditya", 454545L, 300000);
		employee.DisplayEmpolyeeDetails();

	}

}
