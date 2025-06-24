class Circle{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	double CalculateArea() {
		return Math.PI*radius*radius;
	}
	double CalculateCircumference() {
		return 2*Math.PI*radius;
	}
	void Display(){
		System.out.println("Area of circle:- " + radius);
		System.out.println("Area of circle:- " + CalculateArea());
		System.out.println("Area of circle:- " + CalculateCircumference());
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(20);
		circle.Display();

	}

}
