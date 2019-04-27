package com.jspider.app.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.jspider.app.dto.StudentDto;

public class StudentDaoImpl implements StudentDaoInterface {
	Properties properties;

	public StudentDaoImpl() 
	{
		try {
			//holder for the data from the properties file.
			this.properties = new Properties();
			//file will give the location of the properties file in project
			File file= new File("src/com.jspider/app/config/system.properties");
			InputStream stream=new FileInputStream(file);
			this.properties.load(stream);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public int saveStudent(StudentDto student) throws Exception {
		
		String driver=(String)properties.get("driver");
		Class.forName(driver);
		
		String url=(String)properties.get("url");
		Connection connection=DriverManager.getConnection(url,properties);
		
		PreparedStatement prepareStatement = connection.prepareStatement("insert into btm.table_student values(?,?,?,?,?,?,?)");
		prepareStatement.setString(1, student.getFirstName());
		prepareStatement.setString(2, student.getLastName());
		prepareStatement.setString(3, student.getMobileNO());
		prepareStatement.setString(4, student.getUserName());
		prepareStatement.setString(5, student.getPassword());
		prepareStatement.setString(6, student.getEmail());
		prepareStatement.setLong(7, student.getRollNo());
		int update=prepareStatement.executeUpdate();
		
		return update;
	}
	
	
public StudentDto fetchStudent(String userName) throws Exception
{
	Connection con=null;
	String driver=(String)properties.get("driver");
	Class.forName("com.mysql.jdbc.Driver");
	StudentDto student=new StudentDto();
	
System.out.println();
	
	
	return student;
}

}









