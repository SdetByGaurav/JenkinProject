package ProjectForJenkin.ProjectForJenkin;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FetchDataTest {

	@Test
	public void fetchResouces()
	{
		Response resp = given()
				.param("userId", "2")
				.param("id" , "13")
				.pathParam("key", "posts")
.get("https://jsonplaceholder.typicode.com/{key}");
		
		resp.then().log().all();
	}
}
