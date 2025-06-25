package Practiceque;
import java.util.*;
public class Windchilltemperature {
	public double temp(double temperature,double windspeed) {
		double windchill=(35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windspeed, 0.16));
		return windchill;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temperature=sc.nextDouble();
		double windspeed=sc.nextDouble();
		Windchilltemperature obj=new Windchilltemperature();
		double result=obj.temp(temperature, windspeed);
		System.out.println(result);
		
		
	}

}
