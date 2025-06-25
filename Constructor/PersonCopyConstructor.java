class Person {
	
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

   
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        
    }
}

public class PersonCopyConstructor {
    public static void main(String[] args) {
        
        Person person1 = new Person("Aditya", 22);
        System.out.println("Original Person:");
        person1.displayDetails();

        
        Person person2 = new Person(person1);
        System.out.println("Copied Person:");
        person2.displayDetails();
    }
}
