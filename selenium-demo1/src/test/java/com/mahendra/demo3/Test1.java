package com.mahendra.demo3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

class Test1 {

	private WebDriver driver;

	@BeforeEach
	public void initWebDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // Request chrome to run "in memory" with NO GUI
		driver = new ChromeDriver(options);
	}

	@AfterEach
	public void closeDriver() {
		driver.quit();
	}

	@Test
	void test() {
		// Call to @BeforeEach
		driver.get("https://tutorialsninja.com/demo");
		String title = driver.getTitle();
		assertEquals("Your Store", title);
		// Call to @AfterEach
	}

	// Add one more test for https://omayo.blogspot.com/2013/05/page-one.html page
	// check the title
	@Test
	@Disabled
	void test2() {
		// Call to @BeforeEach
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		String title = driver.getTitle();
		assertTrue(title.contains("Page One"));
		// Call to @AfterEach
	}

	@Test
	// Testcase : After you click "button" a checkbox with id "dte" should be enabled after 10 seconds
	void test3() {
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement div = driver.findElement(By.id("HTML47"));
		WebElement button = div.findElement(By.tagName("button"));
		button.click();
		try {
			Thread.sleep(10500); // 10.5 seconds
			WebElement checkbox = driver.findElement(By.id("dte"));
			// Create screenshot in temp file !
			File file= div.getScreenshotAs(OutputType.FILE);
			// Copy the temp file into an existing folder
			Files.copy(file, new File("d:/temp2/screenshop.png"));
			assertTrue(checkbox.isEnabled());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
