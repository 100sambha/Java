package array;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {
		int []elements = {10,21,11,34,23,52,4,221};
		System.out.println(Arrays.toString(elements));
		int remove = 11;
		for (int i = 0; i < elements.length; i++) {
			if(remove==elements[i]) {
				elements[i]=0;
			}
		}
		System.out.println(Arrays.toString(elements));
	}

}
