package abstractAndInterface.VotingApp;

public class VotingAppDemo {
	public static void main(String[] args) {
		VotingApp kids = new Kids(100, "Sambhaji", 11, "Kid");
		kids.registerUser();
		kids.requestVotingNumber();
		
		System.out.println();
		VotingApp adults = new Adults(101, "Sadguru", 45, "Adult");
		adults.registerUser();
		adults.requestVotingNumber();
	}
}