class Students{
	String name;
	int rollnumber;
	int marks;
	
	Students(String name, int rollnumber, int marks){
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
	void displaydetails() {
		System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
	}
}
public class SimulateStudentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student = new Students("aditya", 3 , 70);
		student.displaydetails();

	}

}
