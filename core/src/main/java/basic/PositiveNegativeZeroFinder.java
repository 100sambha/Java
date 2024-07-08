package basic;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

import java.util.Scanner;

public class PositiveNegativeZeroFinder {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		num = sc.nextInt();
		if(num==0) {
			System.out.println("Number is Zero");
		}
		else if(num>0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
		sc.close();
	}
}