package com.mahendra;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ExtDataTest {
	
	private Object[][] credentials;

	// for files outside project, use full path
	private String datafile = "C:\\Users\\Mahendra\\Desktop\\user-creds.xls";
	
	@BeforeEach
	void initData() {
		credentials = ExcelUtil.readExcelData(datafile);
	}
	
	@Test
	void test() {
		// Get ONE credential (pair of username and password)
		for(Object[] cred : credentials) {
			String username = cred[0].toString();
			String password = cred[1].toString();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			System.out.println("User credentials:  "+username+" "+password);
			assertTrue(driver.getCurrentUrl().contains("inventory"));
			driver.quit();
		}
	}

}
