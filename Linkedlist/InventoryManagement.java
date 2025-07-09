class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagement {
    Item head = null;

    void addAtBeginning(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    void addAtEnd(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        if (head == null) head = newItem;
        else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
    }

    void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        Item newItem = new Item(name, id, qty, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                print(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    void searchByName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void sortByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    Item mergeSort(Item head, String field, boolean asc) {
        if (head == null || head.next == null) return head;
        Item mid = getMid(head);
        Item right = mid.next;
        mid.next = null;

        Item leftSorted = mergeSort(head, field, asc);
        Item rightSorted = mergeSort(right, field, asc);

        return merge(leftSorted, rightSorted, field, asc);
    }

    Item merge(Item a, Item b, String field, boolean asc) {
        Item dummy = new Item("", 0, 0, 0);
        Item tail = dummy;

        while (a != null && b != null) {
            boolean condition;
            if (field.equals("name"))
                condition = asc ? a.name.compareToIgnoreCase(b.name) <= 0 : a.name.compareToIgnoreCase(b.name) > 0;
            else
                condition = asc ? a.price <= b.price : a.price > b.price;

            if (condition) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    Item getMid(Item head) {
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void display() {
        Item temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    void print(Item i) {
        System.out.println("Name: " + i.name + ", ID: " + i.id +
                ", Qty: " + i.quantity + ", Price: " + i.price);
    }

    public static void main(String[] args) {
        InventoryManagement inv = new InventoryManagement();

        inv.addAtEnd("Pen", 101, 50, 10.0);
        inv.addAtBeginning("Notebook", 102, 30, 50.0);
        inv.addAtPosition(2, "Pencil", 103, 100, 5.0);

        System.out.println("\nAll Items:");
        inv.display();

        System.out.println("\nSearch by ID 103:");
        inv.searchById(103);

        System.out.println("\nSearch by Name 'Pen':");
        inv.searchByName("Pen");

        System.out.println("\nUpdate Quantity of ID 101 to 70");
        inv.updateQuantity(101, 70);
        inv.display();

        System.out.println("\nTotal Inventory Value:");
        inv.calculateTotalValue();

        System.out.println("\nSorted by Name (Ascending):");
        inv.sortByName(true);
        inv.display();

        System.out.println("\nSorted by Price (Descending):");
        inv.sortByPrice(false);
        inv.display();

        System.out.println("\nRemove item with ID 102:");
        inv.removeById(102);
        inv.display();
    }
}
