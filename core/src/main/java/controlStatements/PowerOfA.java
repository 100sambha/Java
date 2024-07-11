package controlStatements;

import java.util.Scanner;

public class PowerOfA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Number ");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Power of "+num+ " is "+(num*num));
	}

}
