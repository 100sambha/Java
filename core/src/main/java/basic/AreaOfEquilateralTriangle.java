package basic;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		int sideOfTriangle = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of triangle");
		sideOfTriangle = sc.nextInt();
		System.out.println("Area of equilateral triangle :"+((Math.sqrt(3)/4)*sideOfTriangle*sideOfTriangle));
		sc.close();
	}
}