package constructors;

public class Test {
	
	private int num1;
	private int num2;
	
	public Test() {}
	
	public Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void oddEven() {
		System.out.println("Even");
		for (int i = this.num1; i <= this.num2; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

		System.out.println("Odd");
		for (int i = this.num1; i <= this.num2; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public void factorial() {
		int fact1 = 1;
		int fact2 = 1;
		for (int i = 1; i <= this.num2; i++) {
			if(i<=this.num1) {
				fact1*=i;
			}
			if(i<=this.num2) {
				fact2*=i;
			}
		}
		System.out.println("Fact Of "+this.num1+" is "+fact1);
		System.out.println("Fact Of "+this.num2+" is "+fact2);
		
	}
	
	public void sumOfAllDigit() {
		int sum = this.num1;
		for (int i = this.num1; i <= this.num2; i++) {
			sum+=i;
		}
		System.out.println("Sum Of All Digit "+sum);
	}
	
	public static void main(String[] args) {
		Test test = new Test(5,5);
		test.sumOfAllDigit();
		test.oddEven();
		test.factorial();
	}
}
