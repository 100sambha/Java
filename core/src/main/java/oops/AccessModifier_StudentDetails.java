package oops;

import oops.studentDetails.StudentDemo;

public class AccessModifier_StudentDetails {

	public static void main(String[] args) {
		StudentDemo studentDemo = new StudentDemo(1, "Sambhaji", 12345, "Dev");
		
		System.out.println(studentDemo.publicStudent());
		
//		System.out.println(studentDemo.protectedStudent());
		
//		System.out.println(studentDemo.privateStudent);
		
//		System.out.println(studentDemo.defaultStudent());
		
	}
}
