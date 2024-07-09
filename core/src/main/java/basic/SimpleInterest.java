package basic;

public class SimpleInterest {

	public static void main(String[] args) {
		float simpleInterest = 0;
		int principalAmmount = 1800;
		float rateOfInterest = 5.8f;
		float timeInYears = 3.5f;
		
		simpleInterest = (principalAmmount*rateOfInterest*timeInYears)/100f;
		System.out.println("Total interest for "+ principalAmmount +" is "+simpleInterest);
		
	}

}
