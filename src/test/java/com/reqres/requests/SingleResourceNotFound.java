package com.reqres.requests;
import static org.junit.Assert.assertTrue;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SingleResourceNotFound 
{
	@Test
	void singleusernotfound()
	{
		System.out.println("************************************************************************Single Resource Not Found Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"api/users/23");

		int statuscode=response.getStatusCode();
		System.out.println("Status COde is "+statuscode);
		assertTrue("404", true);

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
