package controlFlowStatements;

public class IfStatements {

	public static void main(String[] args) {
//		int num = 101;
		int num = 41;
		
		if(num<0)
			System.out.println("Number is less than 0");
		
		if(num>100)
			System.out.println("Number is greater than 100");
		else if(num<50 && num>=0)
			System.out.println("Number is between 0 and 50");
		else
			System.out.println("Number is less than 100 or equal to 100");
	}
}