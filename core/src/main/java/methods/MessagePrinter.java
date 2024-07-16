package methods;

public class MessagePrinter {
	
	public static void main(String[] args) {
		MessagePrinter messagePrinter = new MessagePrinter();
		messagePrinter.printMessage("Sarkar Raj");
	}
	
	
	public void printMessage(String name) {
		System.out.println(name);
	}
}
