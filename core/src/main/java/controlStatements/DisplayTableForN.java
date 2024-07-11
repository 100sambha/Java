package controlStatements;

import java.util.Scanner;

public class DisplayTableForN {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * num);
		}
	}

}
