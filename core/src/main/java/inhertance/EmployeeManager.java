package inhertance;

public class EmployeeManager extends Employee {

	public EmployeeManager(long employeeId, String employeeName, String employeeAddress, String employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary, specialAllowance, hra);
	}
}