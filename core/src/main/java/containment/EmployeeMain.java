package containment;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(100);;
		employee.setName("Sarkar");
		
		System.out.println("Id :"+employee.getId()+"\nName :"+employee.getName());
	}
}
