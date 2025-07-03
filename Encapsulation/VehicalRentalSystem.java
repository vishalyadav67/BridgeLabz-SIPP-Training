interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per day: ₹" + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1500.0;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber + " (₹1500)";
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500.0;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber + " (₹500)";
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Heavy-duty surcharge
    }

    public double calculateInsurance() {
        return 3000.0;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber + " (₹3000)";
    }
}

public class VehicalRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("MH12AB1234", 1000, "CAR123456");
        Vehicle v2 = new Bike("MH14XY5678", 300, "BIKE987654");
        Vehicle v3 = new Truck("MH20TR9999", 2500, "TRUCK111222");

        Vehicle[] vehicles = {v1, v2, v3};
        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Details ---");
            v.displayInfo();
            System.out.println("Rental Cost for " + rentalDays + " days: ₹" + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + ins.calculateInsurance());
            }
        }
    }
}
