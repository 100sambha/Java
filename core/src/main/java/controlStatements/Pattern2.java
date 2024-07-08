package controlStatements;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class Pattern2 {
	public static void main(String[] args) {
		for (int i = 0; i <9; i++) {
			for (int j = 0; j <5; j++) {
				if(i+j<=4) {
					System.out.print(i+j+1);
				}
				else if(i-j>=4) {
					System.out.print(j-i+9);					
				}
				else
				{
				
				}
			}
			System.out.println();
		}
	}
}