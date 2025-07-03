interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Garage";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    public String getLocation() {
        return currentLocation;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}


class Cars extends Vehicles implements GPS {
    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; 
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}


class Bikes extends Vehicles implements GPS {
    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}


class Auto extends Vehicles implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; 
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
public class RideHailingApp {
    public static void bookRide(Vehicles v, double distance, String newLocation) {
        System.out.println("\n--- Ride Details ---");
        v.getVehicleDetails();
        v.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + v.calculateFare(distance));

        if (v instanceof GPS) {
            GPS gps = (GPS) v;
            gps.updateLocation(newLocation);
            System.out.println("Location updated to: " + gps.getCurrentLocation());
        }
    }

    public static void main(String[] args) {
        Vehicles c1 = new Cars("CAR001", "Anil Mehta", 15);
        Vehicles b1 = new Bikes("BIKE001", "Raj Singh", 8);
        Vehicles a1 = new Auto("AUTO001", "Sunita Devi", 10);

        bookRide(c1, 10, "City Center");
        bookRide(b1, 5, "Mall Road");
        bookRide(a1, 8, "Railway Station");
    }
}
