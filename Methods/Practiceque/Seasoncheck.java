package Practiceque;
import java.util.*;
public class Seasoncheck {
	
	public boolean isSpringSeason(int month, int day) {
        if( (month == 3 && day >= 20 && day <= 31) ||
               (month == 4 && day >= 1 && day <= 30) ||
               (month == 5 && day >= 1 && day <= 31) ||
               (month == 6 && day >= 1 && day <= 20)){
        	return  true;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		Seasoncheck season=new Seasoncheck();
		boolean isSpring=season.isSpringSeason(month, day);
		
		if(isSpring) {
			System.out.println("Spring season");
		}else {
			System.out.println("NOT A SPRING SEASON");
		}
	}

}
