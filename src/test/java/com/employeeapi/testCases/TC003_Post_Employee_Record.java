package com.employeeapi.testCases;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;
import com.employeeapi.base.TestBase;
import com.employeeapi.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TC003_Post_Employee_Record extends TestBase
{
	RequestSpecification httpRequest;
	Response response;
	String empName=RestUtils.empName();
	String empSalary=RestUtils.empSal();
	String empAge=RestUtils.empAge();

	@SuppressWarnings("unchecked")
	@BeforeClass
	void createEmployee() throws InterruptedException
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", empName); // Cast
		requestParams.put("salary", empSalary);
		requestParams.put("age", empAge);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		response = httpRequest.request(Method.POST, "/create");
		Thread.sleep(5000);
	}

	@Test
	void Validations()
	{
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains(empName), true);
		Assert.assertEquals(responseBody.contains(empSalary), true);
		Assert.assertEquals(responseBody.contains(empAge), true);

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "text/html; charset=UTF-8");

		String serverType = response.header("Server");
		Assert.assertEquals(serverType, "nginx/1.14.1");

		String contentEncoding = response.header("Content-Encoding");
		Assert.assertEquals(contentEncoding, "gzip");
	}
}
