package array;

public class ArraySpecificValue {

	public static void main(String[] args) {
		int[] elements = {12,3,54,36,29};
		boolean status = false;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]==54) {
				status = true;
				break;
			}
		}
		if(status) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element Not Found");
		}
	}
}