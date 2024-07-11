package controlStatements;

import java.util.Scanner;

public class CountOfDigitInNuber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num = scanner.nextInt();
		scanner.close();
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("Number Digit Count "+count);
	}

}
