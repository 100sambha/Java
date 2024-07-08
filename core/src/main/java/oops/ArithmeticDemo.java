package oops;

import java.util.Scanner;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class ArithmeticDemo {
	private int number1;
	private int number2;
	private int result;
	
	public ArithmeticDemo() {
		super();
	}

	public ArithmeticDemo(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void add() {
		this.result = this.number1+this.number2; 
		System.out.println("Addition of two num "+this.result);
	}
	public void sub() {
		this.result = this.number1-this.number2; 
		System.out.println("Substraction of two num "+this.result);
	}
	public void mul() {
		this.result = this.number1*this.number2; 
		System.out.println("Multiplication of two num "+this.result);
	}
	public void div() {
		this.result = this.number1/this.number2; 
		System.out.println("Division of two num "+this.result);
	}
	
	public void setInstanceInputs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Two Numbers");
		this.number1 = scanner.nextInt();
		this.number2 = scanner.nextInt();
		scanner.close();
	}
}
