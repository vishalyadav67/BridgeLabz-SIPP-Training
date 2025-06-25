class Vehicle {
    
    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable (shared by all vehicles)
    static double registrationFee = 1500.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
        System.out.println("-------------------------------");
    }

    // Class Method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicalRegistration {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("Ravi Kumar", "Car");
        Vehicle vehicle2 = new Vehicle("Asha Patel", "Scooter");
        Vehicle vehicle3 = new Vehicle("John D'Souza", "Truck");

        System.out.println("-- Vehicle Details --");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("-- After Updating Registration Fee --");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
