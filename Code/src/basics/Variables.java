package basics;

public class Variables {
	
	//Static variables
	static int collegeId = 200;
	static String collegeName = "AA College Ahilyanagar, Maharastra, 414001";
	
	//Instance Variables
	int id = 1;
	String studName = "Sambhaji";

	public static void main(String[] args) {
		
		//local Variable
		String mobileNumber = "9087654321";
		
		Variables v = new Variables();
		System.out.println("Student Name = "+v.userName());
		System.out.println("College Name = "+collegeName);		
		System.out.println("Mobile Number = "+mobileNumber);		
	}
	
	public String userName() {
		return studName;
	}

}
