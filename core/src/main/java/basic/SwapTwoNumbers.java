package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
//		way 1
		int a = 100;
		int b = 200;
		System.out.println("Before Swapping A-"+a+" B-"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping A-"+a+" B-"+b);
		
//		way 2
		a = 11;
		b = 22;
		System.out.println("Before Swapping A-"+a+" B-"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping A-"+a+" B-"+b);
	}

}
