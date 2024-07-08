package basic;

import java.util.Scanner;

/**
 * Author 
 * Sambhaji Pandhare 
 * Software Engineer 
 * +91 841 104 1938
 */

public class AlphabetNumberSymbolFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Character");
		char ch = sc.nextLine().charAt(0);
		if (ch >= 48 && ch <= 57) {
			System.out.println("Character is Number " + ch);
		} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("Character is Alphabet " + ch);
		} else
			System.out.println("Character is Symbol " + ch);
		
		sc.close();
	}
}