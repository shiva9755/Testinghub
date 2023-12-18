package com.ds.APITestingFramework.API;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import com.ds.APITestingFramework.setUp.BaseTest;

import io.restassured.response.Response;

public class DeleteCustomer extends BaseTest{
	
	public static Response sendDeleteRequestToCreateCustomerAPIWithValidAuthKey(Hashtable <String,String> data){
		
		Response response=given().
				auth().
				basic(property.getProperty("ValidSecretKey"), "").
				delete(property.getProperty("customerAPIEndPoint")+"/"+data.get("ID"));
		
		return response;
		
	}
	
 

	
	
	
}
