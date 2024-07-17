package inhertance;

public class WorkerMain {
	public static void main(String[] args) {
		System.out.println("*******Worker Data**********");
		
		WorkerEmployee employee = new WorkerEmployee("Sambhaji", 26, "8411041839", "Pune", 212313.23, "Software", "Development");
		WorkerManager manager= new WorkerManager("Tushar", 25, "7768095436", "Nagar", 432313.23, "QA", "Testing");
		
		employee.displayData();
		manager.displayData();
	}
}