package controlStatements;

import java.util.Scanner;

public class SumOfNumberDigits {
	public static void main(String[] args) {
		System.out.println("Please Enter Number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		int sumOfDigits = 0;
		while(num>0) {
			sumOfDigits+=num%10;
			num/=10;
		}
		
		System.out.println("Sum Of User Entered Digit Is "+sumOfDigits);
	}
}
