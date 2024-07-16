package methods;

public class OverloadMain {
	public static void main(String[] args) {
		Overload overload = new Overload();
		overload.test(100);
		overload.test(200.90f);
		overload.test(300.3432);
		overload.test("Sarkar");
	}
}
