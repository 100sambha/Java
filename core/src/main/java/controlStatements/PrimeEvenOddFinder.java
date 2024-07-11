package controlStatements;

import java.util.Scanner;

public class PrimeEvenOddFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter your choice");
		System.out.println("1.Prime Number\n2.Even Number\n3.Odd Number");
		int choice = scanner.nextInt();

		System.out.println("Please Enter a range");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		scanner.close();
		
		if(choice==1) {
			boolean status = true;
			for (int j = start; j < end; j++) {
				status=true;
				for (int i = 2; i < j; i++) {
					if(j%i==0) {
						status=false;
						break;
					}
				}
				if (status) {
					System.out.println(j);
				}
			}
		}else if(choice==2) {
			for (int i = start; i < end; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}else if (choice==3) {
			for (int i = start; i < end; i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Invalid Entry");
		}
	}

}
