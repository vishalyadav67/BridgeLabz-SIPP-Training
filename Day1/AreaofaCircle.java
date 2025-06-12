package Assignment;

import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter the radius:- ");
        double radius=sc.nextInt();
        double area=pi * radius*radius;
        System.out.println("area of circle is :- ");
        System.out.println(area);
    }
    
}
