package com.mahendra.library.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

/**
 * Test class for MemberResource API.
 * 
 * This class contains integration tests for the MemberResource API endpoints.
 * It uses RestAssured to send HTTP requests and validate responses.
 * 
 * Preconditions:
 * - The application must be running with an embedded server.
 * - The database must be pre-populated with test data for certain tests.
 * 
 * Tests included:
 * - Retrieving all members.
 * - Retrieving a specific member by ID.
 * - Saving a new member.
 * - Updating an existing member.
 * - Deleting a member.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class MemberResourceTest {

	// This annotation is used to inject the port number of the embedded server
	// The port number will be assigned at runtime when the test is executed
	@LocalServerPort
	private int port;
	
	// This is the base URL for the API. It will be used in the tests to make requests to the server
	private static final String BASE_URL="http://localhost";

	/**
	 * Tests the retrieval of all members from the API.
	 * 
	 * This test sends a GET request to the endpoint "/api/members" and verifies
	 * that the response status code is 200, indicating a successful operation.
	 * 
	 * Expected Outcome:
	 * - The API responds with a status code of 200.
	 */
	@Test	
	void testFindAll() {
		given().baseUri(BASE_URL).port(port)
		.when()
		.get("/api/members")
		.then().statusCode(200);
	}

	/**
	 * Tests the retrieval of a specific member by ID.
	 * 
	 * This test sends a GET request to the endpoint "/api/members/1" and verifies
	 * that the response status code is 200, indicating a successful operation.
	 * 
	 * Preconditions:
	 * - A member with ID 1 must exist in the database.
	 * 
	 * Expected Outcome:
	 * - The API responds with a status code of 200.
	 */
	@Test
	void testFindMember() {
		given().baseUri(BASE_URL).port(port)
		.accept(ContentType.JSON)
		.when().get("/api/members/1")
		.then().statusCode(200);
	}

	/**
	 * Tests saving a new member to the API.
	 * 
	 * This test sends a POST request to the endpoint "/api/members/" with a JSON
	 * payload representing the new member. It verifies that the response status
	 * code is 200, indicating a successful operation.
	 * 
	 * Expected Outcome:
	 * - The API responds with a status code of 200.
	 * - The new member is saved in the database.
	 */
	@Test
	void testSave() {
		given().baseUri(BASE_URL).port(port)
		.contentType(ContentType.JSON)
		.body("{\"firstName\":\"Mahendra\",\"id\":3 ,\"lastName\":\"Shinde\",\"status\":\"R\"}")
		.when().post("/api/members/")
		.then().statusCode(200);
	}

	/**
	 * Tests updating an existing member's details.
	 * 
	 * This test sends a PUT request to the endpoint "/api/members/1" with a JSON
	 * payload containing updated details for the member. It verifies that the
	 * response status code is 200, indicating a successful operation.
	 * 
	 * Preconditions:
	 * - A member with ID 1 must exist in the database.
	 * 
	 * Expected Outcome:
	 * - The API responds with a status code of 200.
	 * - The member's details are updated in the database.
	 */
	@Test
	void testUpdate() {
		given().baseUri(BASE_URL).port(port)
		.contentType(ContentType.JSON)
		.body("{\"firstName\":\"Dakshata\",\"id\":1 ,\"lastName\":\"Shinde\",\"status\":\"R\"}")
		.when().put("/api/members/1")
		.then().statusCode(200);
	}

	/**
	 * Tests deleting a member by ID.
	 * 
	 * This test sends a DELETE request to the endpoint "/api/members/2" and verifies
	 * that the response status code is 200, indicating a successful operation.
	 * 
	 * Preconditions:
	 * - A member with ID 2 must exist in the database.
	 * 
	 * Expected Outcome:
	 * - The API responds with a status code of 200.
	 * - The member is deleted from the database.
	 */
	@Test
	void testDelete() {
		given().baseUri(BASE_URL).port(port)
		.accept(ContentType.JSON)
		.when().delete("/api/members/2")
		.then().statusCode(200);
	}

}
