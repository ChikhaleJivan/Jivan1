package com.reqres.requests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SingleResource 
{
	@Test
	void singleresource()
	{
		System.out.println("************************************************************************Single Resource Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/users/2");

		int statuscode=response.getStatusCode();
		System.out.println("Status code is "+statuscode);

		long timetaken=response.getTime();
		System.out.println("Time taken to execute request is "+timetaken);

		String statusline=response.getStatusLine();
		System.out.println("Status Line is "+statusline);

		String body=response.getBody().asString();
		System.out.println("Response body is "+body);

		assertEquals(body.contains("janet.weaver@reqres.in"), true);
		assertEquals(body.contains("Janet"), true);
		assertEquals(body.contains("Weaver"), true);
		assertEquals(body.contains("https://reqres.in/img/faces/2-image.jpg"), true);
		assertEquals(body.contains("https://reqres.in/#support-heading"), true);
		assertEquals(body.contains("To keep ReqRes free, contributions towards server costs are appreciated"), true);

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
