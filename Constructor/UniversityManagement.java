class Student {
       
    public int rollNumber;

    protected String name;

    
    private double CGPA;

   
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

  
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 10.0) {
            this.CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }

    
    void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
       
    }
}


class PostgraduateStudent extends Student {

    String thesisTopic;

   
    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

  
    void displayPGDetails() {
        System.out.println("PG Roll No   : " + rollNumber); 
        System.out.println("PG Name      : " + name);       
        System.out.println("Thesis Topic : " + thesisTopic);
        System.out.println("CGPA         : " + getCGPA());  
       
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        Student student1 = new Student(101, "Anshu", 8.5);
        student1.displayStudentDetails();

        student1.setCGPA(9.1); 
        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Aditya", 9.0, "Machine Learning");
        pgStudent.displayPGDetails();
    }
}
