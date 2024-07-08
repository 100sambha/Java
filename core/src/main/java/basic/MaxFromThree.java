package basic;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */

public class MaxFromThree {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 21;
		int num3 = 654;
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 is biggest number "+num1);
		}
		if(num2>num1 && num2>num3) {
			System.out.println("Num1 is biggest number "+num2);
		}
		if(num3>num1 && num3>num2) {
			System.out.println("Num1 is biggest number "+num3);
		}
	}

}
