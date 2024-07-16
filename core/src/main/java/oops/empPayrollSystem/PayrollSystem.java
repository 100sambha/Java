package oops.empPayrollSystem;

import java.util.ArrayList;

public class PayrollSystem {
	
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem() {
		employeeList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(int employeeId) {
		Employee removeEmployee = null;
		for (Employee employee : employeeList) {
			if(employee.getId()==employeeId) {
				removeEmployee = employee;
				break;
			}
		}
		System.out.println(removeEmployee);
		employeeList.remove(removeEmployee);
	}
	
	public void displayEmployee() {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}