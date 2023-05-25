package RestAssured;

import static io.restassured.RestAssured.given;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import resources.Log4j;

public class APITest {

	String baseURL = "http://localhost:8080/medicare/show/";

	@Test
	public void getAllProducts() {

		DOMConfigurator.configure("log4j.xml");
		Log4j.startTestCase("getMethodwithPathParam");
		Response res = given().when().get(baseURL + "all/products");
		Assert.assertEquals(res.getStatusCode(), 200);

		System.out.println(res.asPrettyString());
		Log4j.info(res.asPrettyString());
		System.out.println("Get All products is successfully");

	}

	@Test
	public void getCategoryTwo() {

		DOMConfigurator.configure("log4j.xml");
		Log4j.startTestCase("getMethodwithPathParam");
		Response res = given().when().get(baseURL + "category/2/products");
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.asString().contains("Analgesics"), true);

		System.out.println(res.asPrettyString());
		Log4j.info(res.asPrettyString());

		System.out.println("Get Category two is successfully");

	}

}