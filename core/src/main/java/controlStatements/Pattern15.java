package controlStatements;

public class Pattern15 {

	public static void main(String[] args) {
		int rem = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if(j+i>=4 && j-i<=4 && j%2==rem) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			if(rem==1) {
				rem--;
			}
			else {
				rem++;
			}
			System.out.println();
		}
	}

}
