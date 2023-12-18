package com.ds.APITestingFramework.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.APITestingFramework.API.DeleteCustomer;
import com.ds.APITestingFramework.Utilities.DataUtils;
import com.ds.APITestingFramework.setUp.BaseTest;

import io.restassured.response.Response;

public class DeleteCustomerTest extends BaseTest{
	
	
	@Test(dataProviderClass=DataUtils.class, dataProvider="data")
	public void ValidateDeleteCustomerAPIWithValidID(Hashtable <String,String> data){
		
		Response response=DeleteCustomer.sendDeleteRequestToCreateCustomerAPIWithValidAuthKey(data);
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200);
		
		
	}

	

	

}
