package com.ds.APITestingFramework.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.APITestingFramework.API.CreateCustomer;
import com.ds.APITestingFramework.Utilities.DataUtils;
import com.ds.APITestingFramework.setUp.BaseTest;

import io.restassured.response.Response;

public class CreateCustomerTest extends BaseTest{
	
	
	@Test(dataProviderClass=DataUtils.class, dataProvider="data")
	public void ValidateCreateCustomerAPIWithValidSecreateKey(Hashtable <String,String> data){
		
		Response response=CreateCustomer.sendPostRequestToCreateCustomerAPIWithValidAuthKey(data);
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200);
		
		
	}
	
	@Test(dataProviderClass=DataUtils.class, dataProvider="data")
    public void ValidateCreateCustomerAPIWithInValidSecreateKey(Hashtable <String,String> data){
		
		Response response=CreateCustomer.sendPostRequestToCreateCustomerAPIWithInValidAuthKey(data);
				
				response.prettyPrint();
				
				System.out.println(response.statusCode());
				
				Assert.assertEquals(response.statusCode(), 200);
				
		
	}
	

	

}
