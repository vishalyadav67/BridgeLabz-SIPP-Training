package Assignment;
import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celcius :- ");
        int Celsius=sc.nextInt();
        int fahrenheit=((Celsius * 9/5) + 32);
        System.out.println(fahrenheit);
        
    }
    
}
