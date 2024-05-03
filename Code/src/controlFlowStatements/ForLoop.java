package controlFlowStatements;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int total = 0, start = 0, end = 0;
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Please Enter range for total sum : ");
		start = sc.nextInt();
		end = sc.nextInt();
		sc.close();
		
		for (int i = start; i <= end; i++) {
			total += i;
		}
		System.out.println("Total of "+start +" to "+end+" numbers is - "+total);
	}
}