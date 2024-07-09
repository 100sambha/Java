package basic;

public class DaysToYearsMonthWeek {

	public static void main(String[] args) {
		
		int days = 440;
		System.out.println("Number of days "+days);
		System.out.println();
		
		System.out.println("Numbers of Years "+(days/365));
		days = days%365;
		
		System.out.println("Numbers of Month "+(days/30));
		days = days%30;
				
		System.out.println("Numbers of Weeks "+(days/7));
		days = days%7;
		
		System.out.println("Number of days "+days);
	}

}
