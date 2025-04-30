# Selenium Integration with JUnit

JUnit is a widely used testing framework for Java applications. Selenium can be integrated with JUnit to write and execute automated tests for web applications.

## Setting Up Selenium with JUnit

### Prerequisites
1. Install Java and set up the `JAVA_HOME` environment variable.
2. Add the following dependencies to your `pom.xml` (for Maven):
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.31.0</version>
       </dependency>
       <dependency>
           <groupId>org.junit.jupiter</groupId>
           <artifactId>junit-jupiter</artifactId>
           <version>5.12.2</version>
       </dependency>
   </dependencies>
   ```

### Example Test Case
Below is an example of a Selenium test case using JUnit 5:

```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumJUnitTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testExampleDotComTitle() {
        driver.get("https://www.example.com");
        String title = driver.getTitle();
        assertEquals("Example Domain", title, "Page title should match");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
```
