package controlStatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num = scanner.nextInt();
		int numSafe = num;
		scanner.close();
		int newNum = 0;
		while(num>0) {
			int rem = num%10;
			newNum = (newNum*10+rem);
			num/=10;
		}
		System.out.println(newNum);
		if(numSafe==newNum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number Not a Palindrome");
		}
	}

}
