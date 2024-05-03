package controlFlowStatements;

public class BreakStatement {

	public static void main(String[] args) {
		
	boolean status = false;
		for (int i = 0; i < 10; i++)
		{
			if (Math.round(Math.random()*100)>80)
			{
				System.out.println("You Got it");
				System.out.println("Attempt(s) : "+(i+1));
				status = true;
				break;
			}
		}
		if (!status) {
			System.out.println("Please Try Again");
		}
	}
}
