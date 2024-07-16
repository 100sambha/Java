package constructors;

public class Programming {
	
	public Programming() {
		super();
		System.out.println("I want to learn language");
	}

	public Programming(String course) {
		super();
		System.out.println("I want to learn language "+course);
	}
	
	public static void main(String[] args) {
		Programming programming = new Programming();
		Programming programming2 = new Programming("Java and Python");
	}
}