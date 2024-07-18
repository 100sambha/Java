package array;

public class ReverseArray {
	public static void main(String[] args) {
		int elements[] = {1,2,3,4,5,6,7,8,9,0};
		for (int i = elements.length-1; i >= 0; i--) {
			System.out.print(elements[i]+" ");
		}
	}
}
