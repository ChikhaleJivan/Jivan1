package com.reqres.requests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ListResources
{
	@Test
	void listresources()
	{
		System.out.println("************************************************************************List Resource Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();
		Response respone=httprequest.request(Method.GET,"/api/unknown");

		int code=respone.getStatusCode();
		assertEquals(code, 200);

		String body=respone.getBody().asString();
		System.out.println("Response body is "+body);
	}
}
