class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

     Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

 class StudentRecord {
     Student head = null;

    
     void addAtBeginning(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    
     void addAtEnd(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

     void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos <= 1 || head == null) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Student newStudent = new Student(roll, name, age, grade);
        Student temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds. Adding at end.");
            addAtEnd(roll, name, age, grade);
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
    }

     void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Deleted Roll No: " + roll);
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Roll No " + roll + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted Roll No: " + roll);
        }
    }

    public void searchByRollNumber(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Found: " + temp.rollNumber + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll No " + roll + " not found.");
    }

    public void updateGrade(int roll, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll No " + roll);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll No " + roll + " not found.");
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Student temp = head;
        System.out.println("\nAll Students:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecord manager = new StudentRecord();

        manager.addAtBeginning(1, "Alice", 20, 'A');
        manager.addAtEnd(2, "Bob", 21, 'B');
        manager.addAtPosition(2, 3, "Charlie", 19, 'C');
        manager.displayAll();

        manager.updateGrade(3, 'B');
        manager.searchByRollNumber(3);

        manager.deleteByRollNumber(2);
        manager.displayAll();

        manager.deleteByRollNumber(99);
    }
}
