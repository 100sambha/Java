package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int element[] = {1,2,3,4,5,10};
		int copyArray[] = new int[element.length];
		
		System.out.println(Arrays.toString(element));
		System.out.println(Arrays.toString(copyArray));
		
		for (int i = 0; i < element.length; i++) {
			copyArray[i]=element[i];
		}

		System.out.println(Arrays.toString(element));
		System.out.println(Arrays.toString(copyArray));
	}

}
