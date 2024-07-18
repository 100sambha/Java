package array;

public class ArrayElementIndex {

	public static void main(String[] args) {
		int[] elements = {4,3,2,5,1,7};
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]==1) {
				System.out.println("Index Of "+elements[i]+" is "+(i+1));
				break;
			}
		}
	}
}