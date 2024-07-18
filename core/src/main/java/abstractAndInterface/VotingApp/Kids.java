package abstractAndInterface.VotingApp;

public class Kids implements VotingApp {
	private int id;
	private String name;
	private int age;
	private String type;
	
	public Kids(int id, String name, int age, String type) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}	
	
	@Override
	public void registerUser() {
		if(this.age<12) {
			System.out.println("Id :"+this.id+"\nName :"+this.name);
			System.out.println("You have successfully registered under Kids");
		}
		else {
			System.out.println("You have not successfully registered");
		}
	}
	
	@Override
	public void requestVotingNumber() {
		if(this.type.equalsIgnoreCase("kid")) {
			System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
		}
	}
}