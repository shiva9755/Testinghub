package com.ds.APITestingFramework.API;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import com.ds.APITestingFramework.setUp.BaseTest;

import io.restassured.response.Response;

public class CreateCustomer extends BaseTest{
	
	public static Response sendPostRequestToCreateCustomerAPIWithValidAuthKey(Hashtable <String,String> data){
		
		Response response=given().
				auth().
				basic(property.getProperty("ValidSecretKey"), "").formParam("email",data.get("email")).
				formParam("description",data.get("description")).
				post(property.getProperty("customerAPIEndPoint"));
		
		return response;
		
	}
	
 
	public static Response sendPostRequestToCreateCustomerAPIWithInValidAuthKey(Hashtable <String,String> data){
		
		Response response=given().
				auth().
				basic(property.getProperty("InValidSecretKey"), "").formParam("email",data.get("email")).
				formParam("description",data.get("description")).
				post(property.getProperty("customerAPIEndPoint"));
		return response;
	}

	
	
	
}
