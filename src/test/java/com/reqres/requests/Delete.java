package com.reqres.requests;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Delete
{
	@Test
	void delete()
	{
		System.out.println("************************************************************************Delete Resource Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.DELETE,"api/users/2");

		String body=response.getBody().asString();
		int len=body.length();
		if(len==0)
		{
			System.out.println("Bosy is empty but not null");
		}
		else if(len>0)
		{
			System.out.println("length of body is "+len);
		}
		else
		{
			System.out.println("Body is null");
			assertTrue(body!=null);
		}

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
