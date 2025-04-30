# Selenium

Selenium is a popular open-source framework for automating web browsers. It supports multiple programming languages, including Java, Python, C#, and JavaScript, and allows developers to write tests that simulate user interactions with web applications.

## Quick Start with Selenium WebDriver (Selenium 4 on Java 17)

Below is a simple example to get started with Selenium WebDriver using Java 17:

### Prerequisites
1. Install Java 17 and set up the `JAVA_HOME` environment variable.
2. Install a build tool like Maven or Gradle.
3. Add the Selenium WebDriver dependency to your `pom.xml` (for Maven):
   ```xml
   <dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.31.0</version>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.12.2</version>
	</dependency>
   ```

### Example Code
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumQuickStart {
    public static void main(String[] args) {
       
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.example.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
```
