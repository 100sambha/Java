package basic;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

import java.util.Scanner;

public class ProfitLossCalcy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the value for buy and sell");
		int buy = sc.nextInt();
		int sell = sc.nextInt();
		
		if(buy>sell) {
			System.out.println("You Made loss of "+(buy-sell));
		}
		else {
			System.out.println("You Made Profit of "+(sell-buy));
		}
		sc.close();
	}

}
