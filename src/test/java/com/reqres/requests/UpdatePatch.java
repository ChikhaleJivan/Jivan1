package com.reqres.requests;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class UpdatePatch 
{	
	@Test 
	void update()
	{
		System.out.println("************************************************************************Update Patch Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();

		JsonObject js=new JsonObject();
		js.addProperty("name","morpheus");
		js.addProperty("job","zion resident");

		httprequest.header("Content-type","Application/Json");
		httprequest.body(js.toString());

		Response response=httprequest.request(Method.PATCH,"api/users?page=2");

		String body=response.getBody().asString();
		System.out.println("Response body is "+body);
		
		int stastuscode=response.getStatusCode();
		System.out.println("Status code is "+stastuscode);

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
