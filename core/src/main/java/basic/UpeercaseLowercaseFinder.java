package basic;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */


import java.util.Scanner;

public class UpeercaseLowercaseFinder {
	public static void main(String[] args) {
		char ch = 'a';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a character");
		ch = sc.nextLine().charAt(0);
		
		if(ch>=65 && ch<=90) {
			System.out.println("Upper Case Letter "+ch);
		}
		else if(ch>=97 && ch<=122) {
			System.out.println("Small Case Letter "+ch);
		}
		else {
			System.out.println("Invalid Letter");
		}
		sc.close();
	}
}
