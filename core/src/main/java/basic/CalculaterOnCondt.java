package basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class CalculaterOnCondt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice to choose below operations");
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.None*");
		int choice = sc.nextInt();
		if(choice>0 && choice<5) {
			System.out.println("Pease Enter two Number");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(choice==1) {
				System.out.println("Addition of two number is "+(num1+num2));
			}
			else if(choice==2) {
				System.out.println("Substraction of two number is "+(num1-num2));
			}
			else if(choice==3) {
				System.out.println("Multiplication of two number is "+(num1*num2));
			}
			else {
				System.out.println("Division of two number is "+(num1/num2));
			}
		}
		else {
			System.out.println("Please enter correct choice");
		}
		sc.close();
	}
}
