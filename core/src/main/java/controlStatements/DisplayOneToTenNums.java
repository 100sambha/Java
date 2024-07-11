package controlStatements;

import java.util.Scanner;

public class DisplayOneToTenNums {

	public static void main(String[] args) {
		System.out.println("Chose loop");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.for\n2.while\n3.do...while");
		int choice = scanner.nextInt();
		scanner.close();
		
		int i = 1;
		if(choice==1) {
			for (i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
		else if (choice==2) {
			while (i<=10) {
				System.out.println(i++);				
			}
		}
		else if (choice==3) {
			do {
				System.out.println(i++);				
			}while (i<=10);
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}
}