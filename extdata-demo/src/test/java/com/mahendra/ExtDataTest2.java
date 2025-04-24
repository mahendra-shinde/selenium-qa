package com.mahendra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ExtDataTest2 {
	
	private Object[][] credentials;
	private static String datapath="/user-creds.xls";
	// for files outside project, use full path
	//private static String datafile = "C:\\Users\\Mahendra\\Desktop\\user-creds.xls";
	private WebDriver driver;
	@BeforeEach
	void initData() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@AfterEach
	void tearDown() {
		driver.quit();
	}
	
	// Utility method to provide/extract username and password from external file
	// and PASS THEM to Parameterized Unit Test
	static Stream<Arguments> loginCredentials(){
		//Object [][]data = ExcelUtil.readExcelData(ExtDataTest2.class.getResource(datapath).getPath());
		Object [][]data =ExcelUtil.readExcelData(datapath);
		//"Stream" is feature introduced in Java 8 
		//It provides utility methods to get and store data from arrays
		return Stream.of(data).map(row -> Arguments.of(row[0],row[1]));
	}
	
	
	@ParameterizedTest
	//@CsvFileSource(resources = "/user-creds.csv", numLinesToSkip = 1)
	@MethodSource("loginCredentials")
	// method Source must REFER to "static" method with given name
	void test(String username, String password) {
		driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        System.out.println("Testing with: " + username + " | " + password);
        assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed for user: " + username);
	}

}
