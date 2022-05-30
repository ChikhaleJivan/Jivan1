package com.employeeapi.testCases;
import org.testng.Assert;
import org.testng.annotations.*;
import com.employeeapi.base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@SuppressWarnings("unused")
public class TC001_Get_All_Employees extends TestBase
{
	@BeforeClass
	void getAllEmployees() throws InterruptedException
	{	
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET,"/employees");
	}

	@Test
	void checkResposeBody()
	{
		String responseBody = response.getBody().asString();
		Assert.assertTrue(responseBody!=null);

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 429);

		long responseTime = response.getTime(); 
		Assert.assertTrue(responseTime<10000);

		String statusLine = response.getStatusLine(); 
		Assert.assertEquals(statusLine, "HTTP/1.1 429 Too Many Requests");

		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "application/json");

		String serverType = response.header("Server");
		Assert.assertEquals(serverType, "nginx/1.14.1");


		String contentEncoding = response.header("Content-Encoding");
		Assert.assertEquals(contentEncoding, "gzip");

		String contentLength = response.header("Content-Length");
		Assert.assertTrue(Integer.parseInt(contentLength)>100);

		String cookie = response.getCookie("PHPSESSID");
		System.out.println(cookie);
	}
}
