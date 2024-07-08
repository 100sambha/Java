package basic;

import java.util.Scanner;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class LeapYearFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Year");
		
		int year = sc.nextInt();
		if(year%4==0) {
			System.out.println("Year is leap Year");
		}
		else {
			System.out.println("Year is not leap year");
		}
		sc.close();
	}
}
