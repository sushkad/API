package com.FincoreTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class TestAPI {

	//@Test
	public void Test1()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		//Response response = RestAssured.get("http://123.108.32.20:9070/ParaguayPublicWS/MService.svc/getModuleType");

		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());

		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);

	}

	//	@Test
	public void Test2()
	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].id", equalTo(8)).
		log().
		all();	
	}

	@Test
	public void Test3()
	{
		given().
		when().
		//get("http://123.108.32.20:9070/ParaguayPublicWS/MService.svc/getModuleType").
		get("http://117.202.21.11/PJSB_XAM_GPRS_UAT_V2/GetResponse.svc/GetPhoneNumberFromGUID").
		then().log().body().statusCode(200);

	}
	
	@Test
	public void Test4()
	{
		given().
		when().
		//get("http://123.108.32.20:9070/ParaguayPublicWS/MService.svc/getModuleType").
		get("http://117.202.21.11/PJSB_XAM_GPRS_UAT_V2/GetResponse.svc/InitializeDevice").
		then().log().body().statusCode(200);

	}
}
