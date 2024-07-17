package containment.college;

public class StaffPersonDetails {
	public static void main(String[] args) {
		Address staffAddress = new Address(206, "Ahilyanagar", "Maharastra", "Bharat");
		Address collegeAddress = new Address(800, "Ahilyanagar", "Maharastra", "Bharat");
		Address pesronAddress = new Address(106, "Chvhanwadi", "Maharastra", "Bharat");
		College college = new College("DVVP COE, Ahilyanagar", collegeAddress);
		Staff staff = new Staff("Dr Patil", staffAddress, college);
		Person person = new Person("Sambhaji", "7648262987", "Developer", 1120, "Hyd", pesronAddress, college);
		
		staff.displayStaffDetails();
		System.out.println("\n");
		person.displayPersonDetails();
	}
}