package com.basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class VowelConsonent {
	public static void main(String[] args) {
		char ch = '0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Character");
		ch = sc.nextLine().charAt(0);
		if(ch<'A' || ch>'z') {
			System.out.println("Invalid Input");
		}
		else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("You Entered Vowel "+ch);
		}
		else {
			System.out.println("You Entered Consonent "+ch);
		}
		sc.close();
	}
}