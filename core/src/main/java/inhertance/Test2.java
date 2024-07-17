package inhertance;

public class Test2 extends Test1 {
	private int num3;

	public Test2(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3 = num3;
	}
	
	public void dispay() {
		System.out.println("Num3 "+num3);
		super.dispay();
	}
}