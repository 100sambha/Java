package constructors;

public class CopyConstructorMain {
	public static void main(String[] args) {
		CopyConstructor p1 = new CopyConstructor(10, 20);

		System.out.println("Original Point:");
		p1.display();

		CopyConstructor p2 = new CopyConstructor(p1);

		System.out.println("Copied Point:");
		p2.display();
		
		p1 = new CopyConstructor(100,200);
		System.out.println("Modified Original Point:");
		p1.display();

		System.out.println("Copied Point after modification of original:");
		p2.display();
	}
}
