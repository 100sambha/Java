 package inhertance;

public class EmployeeTrainer extends Employee {

	public EmployeeTrainer(long employeeId, String employeeName, String employeeAddress, String employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary, specialAllowance, hra);
	}
}