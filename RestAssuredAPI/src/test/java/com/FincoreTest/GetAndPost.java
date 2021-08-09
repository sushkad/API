package com.FincoreTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
public class GetAndPost {

	@Test
	public void Test1Get()
	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").
		then().statusCode(200).
		statusCode(200).body("data[2].first_name",equalTo("Tobias")).
		body("data.first_name",hasItems("Tobias","Howell"));
	}

	@Test
	public void Test2Post()
	{
		Map<String,Object>map = new HashMap<String,Object>();
		map.containsValue(317);
		map.put("Job","Lindsay");

		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toString());
	}
	
	/*
	 * //@Test public void TestFincoreAPI() { given().get(
	 * "http://123.108.32.20:9070/ParaguayPublicWS/MService.svc/getModuleType").
	 * then(). statusCode(200);
	 * 
	 * }
	 */

	/*
	 * //@Test public class ModuleCuidBase { public String Cuid { get; set; }
	 * //parametrized services 317 204 public String Cuid; ModuleCuidBase mcb = new
	 * ModuleCuidBase(); mcb.Cuid = "317"; given().get(
	 * "http://123.108.32.20:9070/ParaguayPublicWS/MService.svc/getModuleType",mcb).
	 * then().statusCode(200);
	 * 
	 * }
	 */
}
