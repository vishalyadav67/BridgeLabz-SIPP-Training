import java.util.*;

]abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by Exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by Assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by Research.");
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName());
        System.out.println("Instructor: " + courseType.getInstructor());
        courseType.evaluate();
    }
}

class CourseUtils {
    public static void displayAll(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName() + " | Instructor: " + course.getInstructor());
            course.evaluate();
        }
    }
}

public class UniversityCourse {
    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics", "Dr. Sharma"));
        Course<AssignmentCourse> javaCourse = new Course<>(new AssignmentCourse("Java Programming", "Prof. Singh"));
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("AI Research", "Dr. Gupta"));

        mathCourse.showCourseDetails();
        javaCourse.showCourseDetails();
        aiCourse.showCourseDetails();

        List<CourseType> catalog = new ArrayList<>();
        catalog.add(mathCourse.getCourseType());
        catalog.add(javaCourse.getCourseType());
        catalog.add(aiCourse.getCourseType());

        System.out.println("\n--- All Courses in Catalog ---");
        CourseUtils.displayAll(catalog);
    }
}
