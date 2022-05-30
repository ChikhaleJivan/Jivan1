package com.employeeapi.testCases;
import org.testng.Assert;
import org.testng.annotations.*;
import com.employeeapi.base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TC002_Get_Single_Employee_Record extends TestBase
{
	RequestSpecification httpRequest;
	Response response;

	@BeforeClass
	void getEmployeeData() throws InterruptedException
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/employee/"+empID);
		Thread.sleep(7000);
	}

	@Test()
	public void validations()
	{
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains(empID), true);

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		long responseTime = response.getTime();
		Assert.assertTrue(responseTime<6000);

		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "text/html; charset=UTF-8");

		String serverType = response.header("Server");
		Assert.assertEquals(serverType, "nginx/1.14.1");

		String contentLength = response.header("Content-Length");
		Assert.assertTrue(Integer.parseInt(contentLength)<1500);
	}
}