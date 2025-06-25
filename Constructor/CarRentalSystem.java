class CarRental{
	String CustomerName;
	String carModel;
	int rentalDay;
	int ratePerDay = 1500;
	
	CarRental(){
		CustomerName = "Aditya";
		carModel = "rolls royce";
		rentalDay = 2;
	}
	CarRental(String CustomerName, String carModel, int rentalDay) {
        this.CustomerName = CustomerName;
        this.carModel = carModel;
        this.rentalDay = rentalDay;
}
	int calculateTotalCost() {
        return rentalDay * ratePerDay;
    }
	
	void displayDetails() {
		 System.out.println("Customer Name : " + CustomerName);
	        System.out.println("Car Model     : " + carModel);
	        System.out.println("Rental Days   : " + rentalDay);
	        System.out.println("Rate per Day  : " + ratePerDay);
	        System.out.println("Total Cost    : " + calculateTotalCost());
	        System.out.println();
	}
public class CarRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental rental2 = new CarRental();
        System.out.println("Default Rental Details:");
        rental2.displayDetails();
        
		CarRental rental1 = new CarRental("Anshu", "range rover", 3);
		System.out.println("Custom Rental Details:");
        rental1.displayDetails();

	}

}
}
