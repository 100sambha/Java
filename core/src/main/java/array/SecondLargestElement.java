package array;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] elements = {2,111,9,7,8,10,11,3};
		
		int largest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]>largest) {
				secondLargest=largest;
				largest=elements[i];
			}
			if(elements[i]!=largest && elements[i]>secondLargest) {
				secondLargest=elements[i];
			}

		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}

}
