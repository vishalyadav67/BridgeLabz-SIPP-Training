package Assignment;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal:-");
        double  Principal=sc.nextInt();
        System.out.println("enter rate:- ");
        double Rate=sc.nextInt();
        System.out.println("enter time:- ");
        double Time=sc.nextInt();
        double si=((Principal * Rate * Time) / 100);
        System.out.println("simple intrest is:- ");
        System.out.println(si);
    }
    
}
