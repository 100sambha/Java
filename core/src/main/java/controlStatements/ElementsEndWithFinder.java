package controlStatements;

import java.util.Scanner;

public class ElementsEndWithFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter start and end range");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		System.out.println("Please Enter number to find ends with");
		int endsWith = scanner.nextInt();
		scanner.close();
		
		int i = start;
		while(i<end) {
			if(i%10==endsWith) {
				System.out.println(i);
			}
			i++;
		}
	}
}