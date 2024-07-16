package methods;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************Student Data*************");
		System.out.println("Please Enter Roll Number:");
		int rollNo = scanner.nextInt();
		System.out.println("Please Enter Name:");
		scanner.nextLine();
		String userName = scanner.nextLine();
		System.out.println("Please Enter Contact Number");
		String contactNo = scanner.nextLine();
		System.out.println("Please Enter Marks");
		double marks = scanner.nextDouble();
		System.out.println("***************************************");
		
		
		System.out.println("Do You Want to See User Details(Y/N)");
		scanner.nextLine();
		char ch = scanner.nextLine().charAt(0);		
		if(ch=='Y'||ch=='y') {
		scanner.close();
		
		Student student = new Student(rollNo, userName, contactNo, marks);
		System.out.println("Roll No :"+student.getRollNo());
		System.out.println("Name :"+student.getName());
		System.out.println("Contact Number :"+student.getContactNo());
		System.out.println("Marks :"+student.getTotalMarks());
		}
		System.out.println("***************************************");
		System.out.println("Student Saved Successfully........");
		System.out.println("***************************************");
	}
}