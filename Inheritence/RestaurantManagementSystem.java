

interface Worker {
    void performDuties();
}

class Persons {
    protected String name;
    protected int id;

    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Persons implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Role: Chef");
        displayInfo();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepare meals and manage the kitchen.");
    }
}

class Waiter extends Persons implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Assigned Tables: " + tableCount);
        System.out.println("Duties: Serve food and attend to customers.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101, "Indian Cuisine");
        Waiter waiter = new Waiter("Amit", 202, 5);

        System.out.println(" Chef Duties ");
        chef.performDuties();

        System.out.println(" Waiter Duties ");
        waiter.performDuties();
    }
}
