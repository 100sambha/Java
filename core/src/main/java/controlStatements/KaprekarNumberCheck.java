package controlStatements;

import java.util.Scanner;

public class KaprekarNumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		scanner.close();
		int numSafe = num;
		int square = num * num;
		
		int cnt = 0;
		while(num>0) {
			num/=10;
			cnt++;
		}
		int divisior = (int) Math.pow(10, cnt);
		
		int sqAdd = square/divisior+square%divisior;
		
		if(sqAdd==numSafe) {
			System.out.println("Given Number is Keprekar Number");
		}else {			
			System.out.println("Given Number is Not Keprekar Number");
		}
	}
}