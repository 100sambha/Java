package controlStatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Please Enter Choice");
		System.out.println("1.Check Prime Number\n2.Print Series Of Prime Numbers");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("Please Enter Number to check or to print series");
		int num = scanner.nextInt();
		scanner.close();

		if (choice == 1) {
			boolean status = false;
			for (int i = 2; i < num; i++) {
				if (num / i == 0) {
					status = true;
					break;
				}
			}
			if (status) {
				System.out.println("Not a Prime Number");
			} else {
				System.out.println("Number is Prime");
			}
		} else if (choice == 2) {
			System.out.println(1);
			for (int i = 2; i < num; i++) {
				boolean status = false;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						status = true;
						break;
					}
				}
				if (!status) {
					System.out.println(i);
				}
			}
		}

	}

}
