
interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayElectricVehicleInfo() {
        System.out.println("Type: Electric Vehicle");
        displayInfo();
        charge();
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

    public void displayPetrolVehicleInfo() {
        System.out.println("Type: Petrol Vehicle");
        displayInfo();
        refuel();
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        System.out.println("=== Electric Vehicle ===");
        ev.displayElectricVehicleInfo();

        System.out.println("\n=== Petrol Vehicle ===");
        pv.displayPetrolVehicleInfo();
    }
}
