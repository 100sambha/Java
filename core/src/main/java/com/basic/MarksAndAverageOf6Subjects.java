package com.basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class MarksAndAverageOf6Subjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of six subjects :");
		int marathi = sc.nextInt();
		int hindi = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		int science = sc.nextInt();
		int history = sc.nextInt();
		
		int totalMarks = marathi+hindi+english+math+science+history;
		float average = totalMarks/6f;
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Average Of Marks : "+average);
		sc.close();
	}
}