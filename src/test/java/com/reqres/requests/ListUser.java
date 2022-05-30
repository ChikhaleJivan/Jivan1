package com.reqres.requests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.employeeapi.base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
public class ListUser extends TestBase
{
	@Test
	void ListUsersOnPageTwo()
	{
		System.out.println("************************************************************************List Users Test Case************************************************************************");
		RestAssured.baseURI = "https://reqres.in/";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET,"/api/users?page=2");

		String responseBody = response.getBody().asString();
		Assert.assertTrue(responseBody!=null);

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		long responseTime = response.getTime(); 
		Assert.assertTrue(responseTime<10000);

		String statusLine = response.getStatusLine(); 
		Assert.assertEquals("HTTP/1.1 200 OK",statusLine);

		System.out.println("*********ALL HEADERS***********");

		int i=1;
		Headers allheaders=response.headers();
		for(Header h:allheaders)
		{
			System.out.println(+i+"."+h.toString());
			i=i+1;
		}
	}
}
