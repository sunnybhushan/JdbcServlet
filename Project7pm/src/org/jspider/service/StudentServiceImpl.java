package org.jspider.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.jspider.dao.StudentDaoImpl;
import org.jspider.dao.StudentDaoInterface;
import org.jspider.dto.StudentDto;

public class StudentServiceImpl implements StudentServiceInterfce {

	StudentDaoInterface studentDao = new StudentDaoImpl();

	@Override
	public int saveStudent(StudentDto student) throws Exception {

		String password = student.getPassword();
		// dummy logic just for test
		String newpassword = password +password;
		student.setPassword(newpassword);
		
		int result = studentDao.saveStudent(student);
		
		return result;
	}

public String encodePassword(String value)
{
	
	return value;
	
}

	
	@Override
	public StudentDto fetchStudent(String userName) throws Exception {
		// some logic or no logic 
		 StudentDto  student = studentDao.fetchStudent(userName);
		return student;
	}


	@Override
	public int deleteStudent(long rollNo) throws Exception {
		int result = studentDao.deleteStudent(rollNo);
		return result;
	}


	@Override
	public int deleteStudent(String userName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public StudentDto updateStudent(String student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}




}
