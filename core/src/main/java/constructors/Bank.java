package constructors;

public class Bank {
	private int ammount = 500;

	public Bank() {	}

	public Bank(int ammount) {
		super();
		this.ammount = this.ammount + ammount;
	}
	
	public void displayAmmount() {
		System.out.println("Ammount "+this.ammount);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank bank2 = new Bank(400);
		
		bank.displayAmmount();
		bank2.displayAmmount();
	}
}