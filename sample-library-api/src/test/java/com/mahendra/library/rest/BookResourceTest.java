package com.mahendra.library.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;


/**
 * Test class for BookResource REST API.
 * <p>
 * This class contains test cases for CRUD operations on books.
 * It uses the following annotations:
 * <ul>
 *   <li>{@link SpringBootTest} - To load the application context for testing.</li>
 *   <li>{@link AutoConfigureMockMvc} - To enable and configure MockMvc for testing.</li>
 *   <li>{@link LocalServerPort} - To inject the random port used by the application.</li>
 * </ul>
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class BookResourceTest {
	@LocalServerPort
	private int port;
	
	private static final String BASE_URL="http://localhost";

	/**
	 * Test to verify that the API returns all books with a 200 status code.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code GET /api/books}</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 200.
	 */
	@Test
	void testFindAll() {
		given().baseUri(BASE_URL).port(port)
		.when()
		.get("/api/books")
		.then().statusCode(200);
	}

	/**
	 * Test to verify that the API returns a specific book with a 200 status code.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code GET /api/books/1}</li>
	 *   <li>Accept header: {@code application/json}</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 200 and valid book details in JSON format.
	 */
	@Test
	void testFindBook() {
		given().baseUri(BASE_URL).port(port)
		.accept(ContentType.JSON)
		.when().get("/api/books/1")
		.then().statusCode(200);
	}

	/**
	 * Test to verify that the API returns a 404 status code when a book is not found.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code GET /api/books/10}</li>
	 *   <li>Accept header: {@code application/json}</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 404 and an error message containing "not found".
	 */
	@Test
	void testFindBook2() {
		given().baseUri(BASE_URL).port(port)
		.accept(ContentType.JSON)
		.when().get("/api/books/10")
		.then().statusCode(404).body("Error",containsString("not found"));
	}
	
	/**
	 * Test to verify saving a new book.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code POST /api/books}</li>
	 *   <li>Request body: Valid book details in JSON format</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 201 and the saved book details in JSON format.
	 * <p>
	 * <b>Note:</b> Currently not implemented.
	 */
	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	/**
	 * Test to verify updating an existing book.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code PUT /api/books/{id}}</li>
	 *   <li>Request body: Updated book details in JSON format</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 200 and the updated book details in JSON format.
	 * <p>
	 * <b>Note:</b> Currently not implemented.
	 */
	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test to verify deleting a book.
	 * <p>
	 * <b>Test Conditions:</b>
	 * <ul>
	 *   <li>API endpoint: {@code DELETE /api/books/{id}}</li>
	 *   <li>Base URL: {@code http://localhost}</li>
	 *   <li>Port: Injected random port</li>
	 * </ul>
	 * <b>Expected Result:</b> HTTP status code 204 (No Content).
	 * <p>
	 * <b>Note:</b> Currently not implemented.
	 */
	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
