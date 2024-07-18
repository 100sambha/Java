package abstractAndInterface.Vehicle;

import abstractAndInterface.VotingApp.ArithmeticOperation;

public class ArithmeticOperationImplementation implements ArithmeticOperation {

	private int num1;
	private int num2;
	
	public ArithmeticOperationImplementation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void addition() {
		System.out.println("Addition Of Two Num is "+(this.num1+this.num2));
	}

	@Override
	public void substraction() {
		System.out.println("Substraction Of Two Num is "+(this.num1-this.num2));
		
	}

	@Override
	public void multiplication() {
		System.out.println("Multiplication Of Two Num is "+(this.num1*this.num2));
		
	}

	@Override
	public void division() {
		System.out.println("Division Of Two Num is "+(this.num1/this.num2));
		
	}

}
