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
public class RegisterSuccessful 
{
	@Test 
	void registersuccessful()
	{
		System.out.println("************************************************************************Register Successful Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();

		JsonObject js=new JsonObject();
		js.addProperty("email","eve.holt@reqres.in");
		js.addProperty("password","");

        httprequest.header("Content-Type","Application/Json");
		httprequest.body(js.toString());

		Response response=httprequest.request(Method.POST,"/api/register");

		String body=response.getBody().asString();
		System.out.println("Response body is "+body);

		assertTrue(body.contains("id"));
		assertTrue(body.contains("4"));
		assertTrue(body.contains("token"));
		assertTrue(body.contains("QpwL5tke4Pnpja7X4"));

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
