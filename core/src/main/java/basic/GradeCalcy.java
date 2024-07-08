package basic;

import java.util.Scanner;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class GradeCalcy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		int percentage = sc.nextInt();
		if(percentage>100 || percentage<0) {
			System.out.println("Invalid input");
		}
		else if(percentage>=90) {
			System.out.println("You Got A Grade");
		}
		else if(percentage>=80) {
			System.out.println("You Got B Grade");			
		}
		else if(percentage>=70) {
			System.out.println("You Got C Grade");			
		}
		else if(percentage>=60) {
			System.out.println("You Got D Grade");			
		}
		else if(percentage>=40) {
			System.out.println("You Got E Grade");			
		}
		else if(percentage<=40 && percentage>=0) {
			System.out.println("You Got F Grade");			
		}
		sc.close();
	}

}
