package controlStatements;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to get Harshad Number series");
		int num = scanner.nextInt();
		scanner.close();
		int range = num;
		int numSafe = num;
		int divisor = 0;
		
		for (int i = 1; i < range; i++) {
			num=i;
			divisor = 0;
			numSafe = num;
			while(num>0) {
				divisor += num%10;
				num/=10;
			}
			if(numSafe%divisor==0) {
				System.out.println(numSafe);
			}
		}
	}
}