package com.jspider.app.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestClass {
	
	public static void main(String[] args) throws Exception
	{
		Properties properties=new Properties();
		File file=new File("D:\\system.properties");
		InputStream inputStream=new FileInputStream(file);
		properties.load(inputStream);
		
		Object object1=properties.get("user");
		String user=(String)object1;
		
		System.out.println(user);
	}

}
