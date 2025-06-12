package Assignment;
import java.util.Scanner;
public class VolumeofaCylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter radius:- ");
        int radius=sc.nextInt();
        System.out.println("enter heights:- ");
        int height=sc.nextInt();
        double Volume=pi * radius*radius * height;
        System.out.println("volume of cylinder is :- ");
        System.out.println(Volume);
    }

}