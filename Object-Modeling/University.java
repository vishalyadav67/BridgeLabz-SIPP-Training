import java.util.ArrayList;
import java.util.List;

// Professor class (can teach multiple courses)
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);  // two-way association
        }
    }

    public void showCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course c : courses) {
            System.out.println(" - " + c.getTitle());
        }
    }
}

// Student class (can enroll in multiple courses)
class Student {
     String name;
     List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

     String getName() {
        return name;
    }

     void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);  
        }
    }

     void showEnrolledCourses() {
        System.out.println("Student " + name + " enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getTitle());
        }
    }
}

class Course {
     String title;
     Professor professor;
     List<Student> students;

     Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

     String getTitle() {
        return title;
    }

     void assignProfessor(Professor prof) {
        this.professor = prof;
    }

     void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

     void showCourseInfo() {
        System.out.println("Course: " + title);
        if (professor != null) {
            System.out.println(" Taught by: Prof. " + professor.getName());
        }
        System.out.println(" Enrolled Students:");
        for (Student s : students) {
            System.out.println("  - " + s.getName());
        }
    }
}
public class Universitys {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Mehta");
        Professor prof2 = new Professor("Dr. Roy");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Mathematics");

        Student s1 = new Student("Ananya");
        Student s2 = new Student("Ravi");

        
        prof1.assignCourse(c1);
        prof1.assignCourse(c2);
        prof2.assignCourse(c3);

        
        s1.enrollCourse(c1);
        s1.enrollCourse(c3);

        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        prof1.showCourses();
        prof2.showCourses();

        c1.showCourseInfo();
        c2.showCourseInfo();
        c3.showCourseInfo();
    }
}
