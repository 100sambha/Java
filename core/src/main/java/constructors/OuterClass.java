package constructors;

//Outer class
public class OuterClass {

	// Instance variable
	private int outerVar = 10;

	// Static variable
	private static int staticVar = 20;

	// Inner class (non-static nested class)
	class InnerClass {

		void display() {
			System.out.println("InnerClass: outerVar = " + outerVar);
			System.out.println("InnerClass: staticVar = " + staticVar);
		}
	}

	// Static nested class (can be considered as a top-level class in a way)
	static class StaticNestedClass {

		void display() {
			// Cannot access instance variables of OuterClass directly
			// System.out.println("StaticNestedClass: outerVar = " + outerVar); // Error
			System.out.println("StaticNestedClass: staticVar = " + staticVar);
		}
	}

	// Method that demonstrates local inner class
	public void localInnerClassDemo() {

		// Local inner class inside a method
		class LocalInner {

			void display() {
				System.out.println("LocalInner: outerVar = " + outerVar);
				System.out.println("LocalInner: staticVar = " + staticVar);
			}
		}

		// Create an instance of the local inner class
		LocalInner localInner = new LocalInner();
		localInner.display();
	}

	// Method that demonstrates anonymous inner class
	public void anonymousInnerClassDemo() {

		// Anonymous inner class implementing an interface
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous inner class running...");
			}
		};

		// Start a new thread using the anonymous inner class
		Thread thread = new Thread(runnable);
		thread.start();
	}

	// Main method to run the demo
	public static void main(String[] args) {

		// Create an instance of OuterClass
		OuterClass outer = new OuterClass();

		// Access InnerClass
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();

		// Access StaticNestedClass
		OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
		staticNested.display();

		// Call local inner class demo method
		outer.localInnerClassDemo();

		// Call anonymous inner class demo method
		outer.anonymousInnerClassDemo();
	}
}