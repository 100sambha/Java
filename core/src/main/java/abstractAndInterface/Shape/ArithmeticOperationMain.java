package abstractAndInterface.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import abstractAndInterface.Vehicle.ArithmeticOperationImplementation;
import abstractAndInterface.VotingApp.ArithmeticOperation;

public class ArithmeticOperationMain {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter Two Number ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number1 = reader.readLine(); 

		reader = new BufferedReader(new InputStreamReader(System.in));
		String number2 = reader.readLine(); 
		
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		ArithmeticOperation operation = new ArithmeticOperationImplementation(num1,num2);
		operation.addition();
		operation.substraction();
		operation.multiplication();
		operation.division();
	}
}