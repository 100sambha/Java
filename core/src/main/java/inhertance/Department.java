package inhertance;

/**
 * @author sambhaji.pandhare
 *
 */
public class Department {
	private String departmentName;
	private String hodName;
	public Department(String departmentName, String hodName) {
		super();
		this.departmentName = departmentName;
		this.hodName = hodName;
	}
	
	public void showDepartmentDetails() {
		System.out.println("Department Name :"+this.departmentName);
		System.out.println("HOD Name :"+this.hodName);
		
	}
}
