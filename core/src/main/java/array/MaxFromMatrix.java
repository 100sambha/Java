package array;

public class MaxFromMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{5,12,8},
				{8,1,6}
		};
		int largest = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j]>largest) {
					largest = matrix[i][j];
				}
			}
		}
		System.out.println(largest);
	}

}
