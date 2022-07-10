package com.reqres.requests;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Create
{
	@Test 
	void create() throws Throwable
	{
		System.out.println("************************************************************************Create Resource Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httprequest=RestAssured.given();
		JsonObject js=new JsonObject();
		js.addProperty("name","morpheus");
		js.addProperty("job","leader");
		httprequest.header("Content-Type","Application/Json");
		httprequest.body(js.toString());
		Response response=httprequest.request(Method.POST,"/api/users");
		String body=response.getBody().asString();
		System.out.println("Body is "+body);
		assertTrue(body.contains("morpheus"));
		JsonPath keyvaluedata=response.jsonPath();
		String name=keyvaluedata.get("name");
		System.out.println("Name attributes value is "+name);
		assertTrue(name.contains("morpheus"));
		
		String job=keyvaluedata.get("job");
		System.out.println("Job attributes value is "+job);
		assertTrue(job.contains("leader"));
		Thread.sleep(5000);
		String updatedat=keyvaluedata.get("updatedAt");
		System.out.println("Updated AT "+updatedat);
		int stastuscode=response.getStatusCode();
		System.out.println("Status cod is "+stastuscode);
		long time=response.getTime();
		System.out.println("Time taken is "+time);
		String statusline=response.getStatusLine();
		System.out.println("Status line is "+statusline);
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
