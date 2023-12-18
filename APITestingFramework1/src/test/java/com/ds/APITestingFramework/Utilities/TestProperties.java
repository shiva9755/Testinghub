package com.ds.APITestingFramework.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties property = new Properties();
		
		FileInputStream file= new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		
		property.load(file);

		System.out.println(property.getProperty("baseURI"));
	}

}
