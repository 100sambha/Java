package controlStatements;

public class Pattern9 {
	public static void main(String[] args) {
		int count=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i-j>=0) {
					System.out.print(count+" ");
					count++;
				}
			}
			System.out.println();
		}
	}
}
