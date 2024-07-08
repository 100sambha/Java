package controlStatements;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class Pattern3 {
	public static void main(String[] args) {
		for (int i = 0; i <7; i++) {
			for (int j = 0; j <13; j++) {
				if(i+j<=6) {
					System.out.print((char)(65+j));
				}
				else if(j-i>=6) {
					System.out.print((char)(65-j+12));					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}