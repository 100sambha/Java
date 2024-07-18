package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] elements = {4,2,4,6,7,3,8,5,1,1};
		System.out.println("Before Sorting Array");
		System.out.println(Arrays.toString(elements));
		for (int i = 0; i < elements.length; i++) {
			for (int j = i; j < elements.length; j++) {
				if(elements[i]>elements[j]) {
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		System.out.println("After Sorting Array");
		System.out.println(Arrays.toString(elements));
	}

}
