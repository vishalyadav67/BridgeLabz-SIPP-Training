package Assignment;
import java.util.*;
public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int average=(num1+num2+num3)/3;
        System.out.println(average);
        
    }
    
}
