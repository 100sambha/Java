package controlStatements;

import java.util.Scanner;

public class PellNumberSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to get Pell Series");
		int num = scanner.nextInt();
		scanner.close();
		int firstVal = 0;
		int secondVal = 1;
		int res=0;
		while(firstVal<num) {
			System.out.println(firstVal);
			res = firstVal+secondVal*2;
			firstVal=secondVal;			
			secondVal = res;
		}
	}
}
