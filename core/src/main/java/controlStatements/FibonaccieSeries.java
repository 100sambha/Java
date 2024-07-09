package controlStatements;

public class FibonaccieSeries {

	public static void main(String[] args) {
		int number = 10;
		int temp = 0;
		for(int i = 1;i<number;i++) {
			System.out.println(i);
			i=i+temp;
			temp = i;
		}
	}

}
