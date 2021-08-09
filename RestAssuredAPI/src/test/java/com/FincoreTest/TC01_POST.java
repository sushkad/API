package com.FincoreTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_POST {

	@Test(priority = 0)
	void test_01() throws InterruptedException 
	{
		Response response = post("http://192.168.4.40:62348/api/Login/CreateUser");

		System.out.println("Hi");
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.headers());
		System.out.println(response.getTime());
	
		// response.getBody();
		// response.getStatusCode(); 
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 400);
		
	}
	
	void test_02()
	{
		Response response = post("http://192.168.4.40:62348/api/Login/CreateUser");

		System.out.println("Hi");
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.headers());
		System.out.println(response.getTime());
	
		// response.getBody();
		// response.getStatusCode(); 
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 400);
		
	}
}