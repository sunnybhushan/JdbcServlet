package com.jspider.app.inputOutput;

import java.util.Scanner;

import com.jspider.app.dto.StudentDto;

public class StudentOutput 
{
	public StudentDto createStudent() {
		Scanner sc=new Scanner(System.in);
		StudentDto student= new StudentDto();
		System.out.println("Enter the first Name");
		String firstName=sc.next();
		
		student.setFirstName(firstName);
		System.out.println("Enter the Last Name");
		String lastName=sc.next();
		
		student.setLastName(lastName);
		System.out.println("Enter the Mobile No");
		String mobileNO=sc.next();
		
		student.setMobileNO(mobileNO);
		System.out.println("Enter the UserName");
		String userName=sc.next();
		
		student.setUserName(userName);
		System.out.println("Enter the password ");
		String password=sc.next();
		
		student.setPassword(password);
		System.out.println("Enter the EmailName");
		String email=sc.next();
		
		student.setEmail(email);
		System.out.println("Enter the RollNo");
		long rollNo=sc.nextLong();
		
	
		
		return student;
		
	}
}
