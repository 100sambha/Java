package controlFlowStatements;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		System.out.println("Enter number for table createtion");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int i = 1;
		while(i<=10) {
			System.out.println(i*num);
			i++;
		}
	}
}
