package inhertance;

public class EmployeeActivity {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager(100, "Sambhaji", "Nagar", "884249573", 34999, 20, 40);
		EmployeeTrainer trainer = new EmployeeTrainer(101, "Pooja", "Nagar", "4987438438", 9912, 30, 20);
		
		manager.displayData();
		manager.calculateTransportAllowance(15);
		trainer.displayData();
		trainer.calculateTransportAllowance(0);
	}
}
