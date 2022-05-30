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
public class LogngSuccessfull 
{
	@Test
	void loginsuccessfull()
	{
		System.out.println("************************************************************************LogIn Successful Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();

		JsonObject requestparams=new JsonObject();
		requestparams.addProperty("email","eve.holt@reqres.in");
		requestparams.addProperty("password","cityslicka");

		httprequest.header("Content-Type","Application/Json");
		httprequest.body(requestparams.toString());

		Response response=httprequest.request(Method.POST,"api/login");

		String respbody=response.getBody().asString();
		System.out.println("Response body is "+respbody);

		assertTrue(respbody.contains("token"));
		assertTrue(respbody.contains("QpwL5tke4Pnpja7X4"));

		System.out.println("*********ALL HEADERS***********");

		int stastuscode=response.getStatusCode();
		System.out.println("Status cod is "+stastuscode);

		long time=response.getTime();
		System.out.println("Time taken is "+time);

		String statusline=response.getStatusLine();
		System.out.println("Status line is "+statusline);
		
		int i=1;
		Headers allheaders=response.headers();
		for(Header h:allheaders)
		{
			System.out.println(+i+"."+h.toString());
			i=i+1;
		}
	}
}
