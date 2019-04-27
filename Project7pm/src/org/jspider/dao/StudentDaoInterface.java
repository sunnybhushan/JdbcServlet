package org.jspider.dao;

import org.jspider.dto.StudentDto;

public interface StudentDaoInterface
{

	public int saveStudent(StudentDto dto) throws Exception;	
	public StudentDto fetchStudent(String userName ) throws Exception;
	public int deleteStudent(long rollNo);
	public int updateStudent(String student) throws Exception;
	
}
