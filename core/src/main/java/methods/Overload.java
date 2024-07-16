package methods;

public class Overload {
	public int test(int num) {
		System.out.println(num);
		return 0;
	}
	public float test(float num) {
		System.out.println(num);
		return 0;
	}
	public double test(double num) {
		System.out.println(num);
		return 0;
	}
	public String test(String name) {
		System.out.println(name);
		return "0";
	}
}
