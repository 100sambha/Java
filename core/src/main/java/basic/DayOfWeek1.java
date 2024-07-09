package basic;

import java.util.Scanner;

public class DayOfWeek1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day of week");
		int day = scanner.nextInt();
		scanner.close();
		
		if(day == 1) {
			System.out.println("For number "+day+" week day is Monday");
		}
		else if(day == 2) {
			System.out.println("For number "+day+" week day is Tuesday");
		}
		else if(day == 3) {
			System.out.println("For number "+day+" week day is Wedensday");
		}
		else if(day == 4) {
			System.out.println("For number "+day+" week day is Thursday");
		}
		else if(day == 5) {
			System.out.println("For number "+day+" week day is Friday");
		}
		else if(day == 6) {
			System.out.println("For number "+day+" week day is Saturday");
		}
		else if(day == 7) {
			System.out.println("For number "+day+" week day is Sunday");
		}
		else {
			System.out.println("Invalid Day");
		}
		
		
		
	}

}
