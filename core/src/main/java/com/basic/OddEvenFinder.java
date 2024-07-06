package com.basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class OddEvenFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Please Enter Number");
		num = sc.nextInt();
		if(num<=0) {
			System.out.println("Invalid");
		}
		else if(num%2==0) {
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
