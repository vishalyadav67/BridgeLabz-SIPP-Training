import java.util.ArrayList;
import java.util.List;


class Course {
	String courseName;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

     String getCourseName() {
        return courseName;
    }

     void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); 
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}


class Student {
     String name;
     List<Course> courses;

     Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

     String getName() {
        return name;
    }

     void enrollInCourse(Course course) {
        course.enrollStudent(this); 
    }

     void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

     void viewCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}


class School {
     String schoolName;
     List<Student> students;

     School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

     void addStudent(Student student) {
        students.add(student); 
    }

     void showStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
 class SchoolAndStudentsWithCourse {
    public static void main(String[] args) {
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

       
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        
        School school = new School("Greenwood High");
        school.addStudent(alice);
        school.addStudent(bob);

      
        alice.enrollInCourse(math);
        alice.enrollInCourse(english);

        bob.enrollInCourse(math);
        bob.enrollInCourse(science);

       
        school.showStudents();

        alice.viewCourses();
        bob.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
        english.showEnrolledStudents();
    }
}
