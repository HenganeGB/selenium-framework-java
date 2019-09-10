package com.api.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium_framework.common.ApiTestListener;
import com.selenium_framework.common.FrameworkListeners;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.CoreMatchers.equalTo;

@Listeners(ApiTestListener.class)
public class StudentServiceTest extends RestAssured{
	
	
	{this.baseURI="http://localhost:8081";} // static block
	
	@Test
	public void verifyPort()
	{
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("/port")
		.then()
			.statusCode(200);
	}
	
	@Test
	public void verifyStudentSampleInformation()
	{
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("/student/getSampleResponse")
		.then()
			.statusCode(200)
			.body("firstName",equalTo("Vaibhav"))
			.body("lastName",equalTo("Zodge"))
			.body("email",equalTo("zodgevaibhav@gmail.com"))
			.body("studentId",equalTo("12"));
		
	}
	

}
