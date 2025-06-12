package Assignment2;

public class Pen_dis {

	public static void main(String[] args) {
		int total_pens=14;
		int student=3;
		int pens_perstudent=total_pens/student;
		int remaining =total_pens%student;
        System.out.println("The Pen Per Student is " + pens_perstudent + " and the remaining pen not distributed is " + remaining);


	}

}
