import java.util.ArrayList;
import java.util.List;


class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Faculty: " + name);
    }
}


class University {
    private String universityName;
    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

 
    class Department {
        private String deptName;
        private List<Faculty> facultyList; 

        public Department(String deptName) {
            this.deptName = deptName;
            this.facultyList = new ArrayList<>();
        }

        public void assignFaculty(Faculty faculty) {
            facultyList.add(faculty);
        }

        public void showDepartmentInfo() {
            System.out.println("  Department: " + deptName);
            for (Faculty f : facultyList) {
                System.out.println("    - " + f.getName());
            }
        }
    }


    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

   
    public void showUniversityStructure() {
        System.out.println("University: " + universityName);
        for (Department dept : departments) {
            dept.showDepartmentInfo();
        }
    }
}
public class UniversityApp {
    public static void main(String[] args) {
        
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Radhika");
        Faculty f3 = new Faculty("Dr. Ahmed");

     
        University uni = new University("Delhi University");

        University.Department cs = uni.addDepartment("Computer Science");
        University.Department phy = uni.addDepartment("Physics");

 
        cs.assignFaculty(f1);
        cs.assignFaculty(f2);
        phy.assignFaculty(f3);

        
        uni.showUniversityStructure();

        
        System.out.println("\nIndependent Faculty (not tied to university lifecycle):");
        f1.showInfo();
        f2.showInfo();
        f3.showInfo();

       
        uni = null;
        System.gc(); 

        System.out.println("\nUniversity deleted — departments no longer exist, but faculty still remains.");
    }
}
