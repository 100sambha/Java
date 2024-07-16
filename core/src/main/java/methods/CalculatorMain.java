package methods;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("****************Simple Calculator****************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your Choice");
		int choice = scanner.nextInt();
		
		if(choice>0&&choice<5) {

			System.out.println("Enter First Number ");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second Number ");
			int num2 = scanner.nextInt();
			Calculator calculator = new Calculator();
			
			if(choice==1) {
				System.out.println("Addition Of Two Num Is "+calculator.addition(num1, num2));
			}
			else if (choice==2) {
				System.out.println("Subsraction Of Two Num Is "+calculator.substraction(num1, num2));
			}
			else if (choice==3) {
				System.out.println("Multiplication Of Two Num Is "+calculator.multiplication(num1, num2));
			}
			else {
				System.out.println("Division Of Two Num Is "+calculator.division(num1, num2));
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		scanner.close();
	}
}