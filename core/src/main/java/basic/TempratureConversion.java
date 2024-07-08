package basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class TempratureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		float cel = 0;
		float fah = sc.nextInt();
		cel = (5/9.0f)*(fah-32);
		System.out.println("Fahrenheit to celsius :"+fah+" -> "+cel);
		
		System.out.println("Enter Temperature in Celsius");
		cel = sc.nextInt();
		fah = 32+((9/5f)*cel);
		System.out.println("Fahrenheit to celsius :"+cel+" -> "+fah);
		sc.close();
	}
}
