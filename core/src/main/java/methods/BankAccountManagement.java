package methods;

public class BankAccountManagement {
	private int accNo;
	private String name;
	private double balance = 0;
	private boolean status;

	public BankAccountManagement() {
		super();
	}

	public void insertData(int accNo, String name, double amm, boolean status) {
		if(this.name==null&&name!=null)
		{
			this.accNo = accNo;
			this.name = name;
			this.balance = amm;
			this.status = status;
			System.out.println("New Account Created Successfully");
		}
		else {
			System.out.println("Account Already Exist");
		}
	}
	
	public void displayData() {
		if (this.name!=null) {
			System.out.println("User Account Number "+this.accNo);
			System.out.println("User Name"+this.name);
			System.out.println("User Balance "+this.balance);
			System.out.println("User Status"+this.status);
		}
		else {
			System.out.println("User Not Created");
		}
	}
	
	public void deposite(double amm) {
		if(amm>0 && amm<50000 && this.name!=null) {
			this.balance = this.balance+amm;
			System.out.println("Ammount Deposite Successfully");
		}
		else {
			System.out.println("Ammount Deposite Unsuccessfull");			
		}
	}

	public void withdraw(double amm) {
		if (this.balance>0 && amm>0 && this.balance>amm&&this.name!=null) {
			this.balance = this.balance-amm;
			System.out.println("Ammount withdraw Successfully");
		}
		else {			
			System.out.println("Ammount withdraw Unsuccessfull");
		}
	}
	
	
}
