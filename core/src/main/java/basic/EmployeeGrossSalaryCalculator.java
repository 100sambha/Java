package basic;

import java.util.Scanner;

public class EmployeeGrossSalaryCalculator {

	public static void main(String[] args) {
		 double basicSalary = 0;
		 Scanner scanner = new Scanner(System.in);
		 scanner.close();
		 
		 System.out.println("Please Enter Salary");
		 basicSalary = scanner.nextInt();
		 double grossSalary = 0;
		 
		 if(basicSalary>0 && basicSalary<=10000) {
			 grossSalary = basicSalary+basicSalary*0.2+basicSalary*0.8;
		 }
		 else if (basicSalary>0 && basicSalary<=20000) {			
			 grossSalary = basicSalary+basicSalary*0.25+basicSalary*0.9;
		}
		 else if (basicSalary>0 && basicSalary>20000) {			
			 grossSalary = basicSalary+basicSalary*0.3+basicSalary*0.95;
		 }
		 else {
			 System.out.println("Invalid Basic Salary");
		 }
		 System.out.println("Your Gross salary is "+grossSalary);
		 
		 
	}
}