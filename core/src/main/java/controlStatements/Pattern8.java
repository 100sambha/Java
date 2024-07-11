package controlStatements;

public class Pattern8 {
	public static void main(String[] args) {
		int count=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(count==1) {
					System.out.print(count--+" ");
				}
				else {
					System.out.print(count+++" ");
				}
			}
			System.out.println();
		}
	}
}
