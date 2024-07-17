package inhertance;

/**
 * @author sambhaji.pandhare
 *
 */
public class DepartmentStafMembers extends Department{
	private String memberName;
	private String memberQualification;
	
	public DepartmentStafMembers(String departmentName, String hodName, String memberName, String memberQualification) {
		super(departmentName, hodName);
		this.memberName = memberName;
		this.memberQualification = memberQualification;
	}

	public void showstaffMemberDetails() {
		System.out.println("Member Name :"+this.memberName);
		System.out.println("Member Qualification :"+this.memberQualification);
	}
	
	public static void main(String[] args) {
		DepartmentStafMembers departmentStafMembers = new DepartmentStafMembers("ETC", "Dr.Anita", "Ms.Bhalerao Mam", "Ph.d");
		departmentStafMembers.showstaffMemberDetails();
		departmentStafMembers.showDepartmentDetails();
		}
}