package org.jspider.service;

import org.jspider.dto.StudentDto;

public interface StudentServiceInterfce {
	

	public int saveStudent(StudentDto dto) throws Exception;
	public StudentDto fetchStudent(String userName ) throws Exception;
	public int deleteStudent(String userName)throws Exception;
	public StudentDto updateStudent(String student) throws Exception;
	int deleteStudent(long rollNo) throws Exception;

}