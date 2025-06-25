class Circle{
	double radius;
	
	Circle(){
		radius =2.0;
	}
	Circle(double radius){
		this.radius = radius;
	}
	double CalculateArea() {
		return Math.PI*radius*radius;
	}
	void displayDetails() {
		System.out.println("Radius: " + radius);
        System.out.println("Area  : " + CalculateArea());
        System.out.println();
	}
}
public class CircleConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle defaultCircle = new Circle();
        System.out.println("Circle with Default Radius:");
        defaultCircle.displayDetails();

       
        Circle customCircle = new Circle(5.0);
        System.out.println("Circle with User-Provided Radius:");
        customCircle.displayDetails();

	}

}
