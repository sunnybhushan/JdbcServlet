package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Runner {
	Properties properties=new Properties();
	File file= new File("src/com/config/xyz.properties");
	InputStream steam= new FileInputStream(file);
	properties.load(steam);

}
