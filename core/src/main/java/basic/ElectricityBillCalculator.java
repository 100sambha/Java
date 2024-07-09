package basic;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		 double electricityUnits = 0;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Electricity Units");
		 electricityUnits = scanner.nextInt();
		 scanner.close();
		 double totalBill = 0;
		 if(electricityUnits<0) {
			 System.out.println("Invalid Units");
		 }
		 else {
		 if(electricityUnits<=50) {
			 totalBill = electricityUnits*0.50;
		 }
		 else if(electricityUnits<150) {
			 totalBill = (50*0.50)+((electricityUnits-50)*0.75);
		 }
		 else if(electricityUnits<250) {
			 totalBill = (50*0.50)+((100)*0.75)+((electricityUnits-150)*1.20);
		 }
		 else {
			 totalBill = (50*0.50)+((100)*0.75)+((100)*1.20)+((electricityUnits-250)*1.50);			 
		 }
		 System.out.println("Your Electricity Bill Ammount is "+(totalBill+(totalBill*0.20)));
		 }
		 
	}
}