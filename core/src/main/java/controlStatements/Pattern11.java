package controlStatements;

public class Pattern11 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i-j>=0 && i-j<=4) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

