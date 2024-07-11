package controlStatements;

public class Pattern10 {
	public static void main(String[] args) {
		int count=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i-j>=0) {
					if(count==1) {
						System.out.print(count--+" ");
					}
					else {
						System.out.print(count+++" ");
					}
				}
			}
			System.out.println();
		}
	}
}
