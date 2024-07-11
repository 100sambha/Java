package controlStatements;

import java.util.Scanner;

public class OddEvenBetwGivenRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter start and last number");
		int start = scanner.nextInt();
		int last = scanner.nextInt();
		scanner.close();
		int num = start;
		System.out.println("Even");
		while(num<last) {
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}
		num = start;
		System.out.println("Odd");
		while(num<last) {
			if(num%2!=0) {
				System.out.println(num);
			}
			num++;
		}
	}
}
