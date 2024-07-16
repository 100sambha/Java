package constructors;

public class College {
	private int collegeId = 231444;
	private String collegeName = "Dr. Vitthalrao Vikhe Patil, Ahilyanagar";
	
	
	class Department{
		private String departmentName = "E and TC";
		
		public void dispaly() {
			System.out.println("College Id :"+collegeId);
			System.out.println("College Name :"+collegeName);
			System.out.println("Department Name :"+this.departmentName);
		}
	}
	
	public static void main(String[] args) {
		College college = new College();
		College.Department details = college.new Department();
		details.dispaly();
	}
}
