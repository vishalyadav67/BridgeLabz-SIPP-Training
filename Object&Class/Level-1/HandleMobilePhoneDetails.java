class MobilePhone{
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("Brand:- "+ brand);
		System.out.println("model:- "+ model);
		System.out.println("price:- "+ price);
	}
}
public class HandleMobilePhoneDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone mobile1 = new MobilePhone("Samsung", "S23", 54000);
		MobilePhone mobile2 = new MobilePhone("realme", "narzo", 14000);
		
		System.out.println("-- mobile1 details---");
		mobile1.displayDetails();
		System.out.println("-- mobile2 details---");
		mobile2.displayDetails();
	}

}
