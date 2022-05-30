package com.reqres.requests;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class DelayedResponse 
{
	@Test
	void delayedresponse() throws Throwable
	{
		System.out.println("************************************************************************Delayed Response Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"api/users?delay=3");

		Thread.sleep(5000);
		String responsebody=response.getBody().toString();
		System.out.println("Response body is "+responsebody);

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
