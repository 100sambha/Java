package com.basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class MaxMinFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Please Enter Two Number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is biggest number");
		}
		else {			
			System.out.println(num2+" is biggest number");
		}
		sc.close();
	}
}