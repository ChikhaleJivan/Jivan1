package com.reqres.requests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class LoginUnsuccessfull 
{
	@Test
	void loginunsuccessfull()
	{
		System.out.println("************************************************************************LogIn Unsuccessful Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/#support-heading";
		RequestSpecification httprequest=RestAssured.given();

		JsonObject js=new JsonObject();
		js.addProperty("email","peter@klaven");

		httprequest.header("Content-Type","Application/Json");
		httprequest.body(js.toString());

		Response response=httprequest.request(Method.POST,"/api/login");

		String body=response.getBody().asString();
		System.out.println("Bosy is "+body);

		int respcode=response.getStatusCode();
		System.out.println("Status code is "+respcode);
		assertEquals(400, respcode);

		long time=response.getTime();
		System.out.println("Time taken is "+time+" Mili Seconds");

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
