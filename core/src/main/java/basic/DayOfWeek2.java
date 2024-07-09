package basic;

import java.util.Scanner;

public class DayOfWeek2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day of week");
		int day = scanner.nextInt();
		scanner.close();

		switch (day) {
		case 1:System.out.println("Its Monday");
		break;
		case 2:System.out.println("Its Tuesday");
		break;
		case 3:System.out.println("Its Wedensday");
		break;
		case 4:System.out.println("Its Thursday");
		break;
		case 5:System.out.println("Its Friday");
		break;
		case 6:System.out.println("Its Saturday");
		break;
		case 7:System.out.println("Its Sunday");
		break;
		default:System.out.println("Invalid Entry");
		break;
		}
	}

}