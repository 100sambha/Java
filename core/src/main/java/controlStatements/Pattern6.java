package controlStatements;

public class Pattern6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i-j>=0) {
					System.out.print(i-j+1+" ");
				}
			}
			System.out.println();
		}
	}
}