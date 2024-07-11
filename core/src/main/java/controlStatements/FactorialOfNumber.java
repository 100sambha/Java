package controlStatements;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Number to get Factorial");
		int num = scanner.nextInt();
		scanner.close();
		
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of "+num+" is "+fact);
	}

}
