class items{
	long item_code;
	String item_name;
	double price;
	
	items(long item_code, String item_name, double price ){
		this.item_code = item_code;
		this.item_name = item_name;
		this.price = price;
	}
	double  CalculateTotalCost(double quantity) {
		return price * quantity;
	}
	void displaydetails(){
		System.out.println("Item Code : " + item_code);
        System.out.println("Item Name : " + item_name);
        System.out.println("Price     : ₹" + price);
	}
}
public class TrackInventoryOfItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		items Items = new items(101, "perfume", 100.0 );
		Items.displaydetails();
		
		double quantity = 3;

        // Display total cost
        double totalCost = Items.CalculateTotalCost(quantity);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: ₹" + totalCost);
		
		

	}

}
