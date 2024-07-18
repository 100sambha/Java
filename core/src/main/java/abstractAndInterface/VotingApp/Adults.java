package abstractAndInterface.VotingApp;

public class Adults implements VotingApp {
	private int id;
	private String name;
	private int age;
	private String type;
	
	public Adults(int id, String name, int age, String type) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	public void registerUser() {
		if(this.age>12) {
			System.out.println("Id :"+this.id+"\nName :"+this.name);
			System.out.println("You have successfully registered under Adults");
		}
		else {
			System.out.println("You have not successfully registered");
		}
	}
	
	@Override
	public void requestVotingNumber() {
		if(this.type.equalsIgnoreCase("Adult")) {
			System.out.println("Your voting Id will be generated within a day");
		}
		else {
			System.out.println("Oops, you are no");
		}
	}	
}