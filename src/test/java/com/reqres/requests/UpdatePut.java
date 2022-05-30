package com.reqres.requests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdatePut 
{
	@Test
	void updatePut()
	{
		System.out.println("************************************************************************Update Put Test Case************************************************************************");
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();

		JsonObject js=new JsonObject();
		js.addProperty("name","morpheus");
		js.addProperty("job","zion resident");

		httprequest.header("Content-Type","Application/Json");
		httprequest.body(js.toString());

		Response response=httprequest.request(Method.PUT,"/api/users/2");

		String body=response.getBody().asString();
		System.out.println("Response body is "+body);

		JsonPath jsonpathevaluator=response.jsonPath();
		String name=jsonpathevaluator.get("name");
		System.out.println("Value of name attribute is "+name);
		assertEquals(name, "morpheus");
		String job=jsonpathevaluator.get("job");
		System.out.println("Value of job attribute is "+job);
		assertEquals(job, "zion resident");
		String updatedAt=jsonpathevaluator.get("updatedAt");
		System.out.println("Value of attribute aupdatedat is "+updatedAt);

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
