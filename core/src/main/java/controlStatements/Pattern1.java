package controlStatements;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i+j<=4) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}