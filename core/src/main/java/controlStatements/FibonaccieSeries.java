package controlStatements;

import java.util.Scanner;

public class FibonaccieSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Number to get Fibonaccie Series ");
		int number = scanner.nextInt();
		scanner.close();
		int temp = 1;
		int fibb=1;
		for(int i = 0;i<number;i++) {
			i = temp;
			System.out.println(fibb);
			temp=fibb+i;
			fibb=i;
		}
	}
}