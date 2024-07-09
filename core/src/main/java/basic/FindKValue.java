package basic;

public class FindKValue {
	public static void main(String[] args) {
		int k = 2;
		System.out.println("K : "+(k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++));
	}
}