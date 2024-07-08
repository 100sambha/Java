package controlStatements;

public class YellowPink {

	public static void main(String[] args) {
		int yellow = 0;
		int pink=0;
		int yellowAndPink = 0;
		
		for (int i = 33; i < 999; i++) {
			if(i%3==0) {
				System.out.println("Yellow");
				yellow++;
			}
			if(i%5==0) {
				System.out.println("Pink");
				pink++;
			}
			if(i%3==0 && i%5==0) {
				System.out.println("Yellow&Pink");
				yellowAndPink++;
			}
		}
		System.out.println("Yellow Count : "+yellow);
		System.out.println("Pink Count : "+pink);
		System.out.println("Yellow&Pink Count : "+yellowAndPink);
	}

}
