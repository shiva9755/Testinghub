package com.ds.APITestingFramework.setUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ds.APITestingFramework.Utilities.ExcelUtils;

import io.restassured.RestAssured;

public class BaseTest
 {
	
	public static Properties property = new Properties();
	public static  ExcelUtils excel=new ExcelUtils("D:\\ExcelWriting\\myExcelFile.xlsx");
	
	private FileInputStream file;
	
	@BeforeSuite
	public void setUp(){
		
		try {
			file = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			property.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RestAssured.baseURI=property.getProperty("baseURI");
		RestAssured.basePath=property.getProperty("basePath");
	}
	
	@AfterSuite
	public void tearDown(){
		
	}

}
