class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {
    Task head = null;
    Task current = null;

    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) temp = temp.next;
        newTask.next = temp.next;
        temp.next = newTask;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.id == id && head.next == head) {
            head = null;
            return;
        }

        Task temp = head;
        Task prev = null;

        do {
            if (temp.id == id) {
                if (temp == head) {
                    Task last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                if (current == temp) current = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current == null) current = head;
        if (current != null) print(current);
        else System.out.println("No tasks available.");
    }

    void moveToNextTask() {
        if (current == null) current = head;
        else current = current.next;
        viewCurrentTask();
    }

    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Task temp = head;
        do {
            print(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No task found with priority: " + priority);
    }

    void print(Task t) {
        System.out.println("ID: " + t.id + ", Name: " + t.name +
                           ", Priority: " + t.priority + ", Due: " + t.dueDate);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(101, "Math Homework", 2, "2025-07-10");
        scheduler.addAtBeginning(102, "Project Submission", 1, "2025-07-08");
        scheduler.addAtPosition(2, 103, "Grocery Shopping", 3, "2025-07-07");

        System.out.println("\nAll Tasks:");
        scheduler.displayTasks();

        System.out.println("\nCurrent Task:");
        scheduler.viewCurrentTask();
        System.out.println("Next Task:");
        scheduler.moveToNextTask();
        System.out.println("Next Task:");
        scheduler.moveToNextTask();

        System.out.println("\nSearch Priority 2:");
        scheduler.searchByPriority(2);

        System.out.println("\nRemove Task with ID 103");
        scheduler.removeById(103);
        scheduler.displayTasks();
    }
}
