# RestAssured API Testing Framework Tutorial

## Introduction
RestAssured is a powerful Java library used for testing RESTful APIs. It simplifies the process of sending HTTP requests and validating responses. It is widely used in combination with Spring Boot projects for end-to-end API testing.

## Key Features
- Fluent and easy-to-read syntax.
- Supports GET, POST, PUT, DELETE, and other HTTP methods.
- Built-in support for JSON and XML.
- Integration with popular testing frameworks like JUnit and TestNG.

## Setting Up RestAssured in a Spring Boot Project

### Step 1: Add Dependencies
Add the following dependencies to your `pom.xml` if you are using Maven:
```xml
<dependencies>
    <!-- RestAssured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.3.0</version>
        <scope>test</scope>
    </dependency>
    <!-- Spring Boot Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### Step 2: Configure Base URI
Set the base URI for your API in a test configuration file or directly in your test class:
```java
import static io.restassured.RestAssured.*;

@BeforeAll
public static void setup() {
    baseURI = "http://localhost:8080/api";
}
```

### Step 3: Write Test Cases
Here is an example of a simple test case for a Spring Boot API endpoint:
```java
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    @Test
    public void testGetEndpoint() {
        RestAssured
            .given()
                .header("Content-Type", "application/json")
            .when()
                .get("/users")
            .then()
                .statusCode(200)
                .body("size()", greaterThan(0))
                .body("[0].name", notNullValue());
    }
}
```

### Step 4: Test POST Requests
For POST requests, you can send a JSON payload like this:
```java
@Test
public void testPostEndpoint() {
    String requestBody = "{ \"name\": \"John Doe\", \"email\": \"john.doe@example.com\" }";

    RestAssured
        .given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post("/users")
        .then()
            .statusCode(201)
            .body("id", notNullValue())
            .body("name", equalTo("John Doe"));
}
```

## Tips for Using RestAssured with Spring Boot
1. **Use MockMvc for Unit Tests**: For testing controllers in isolation, consider using `MockMvc` instead of RestAssured.
2. **Leverage Spring Profiles**: Use Spring profiles to configure different environments (e.g., test, dev, prod).
3. **Test Authentication**: RestAssured supports basic, OAuth, and other authentication mechanisms.

## Conclusion
RestAssured is a versatile tool for API testing in Spring Boot projects. By integrating it into your test suite, you can ensure the reliability and correctness of your APIs with minimal effort.
