package com.mahendra.demo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.pagefactory.ByChained;

class TestLogin {

	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		driver.get("https://www.saucedemo.com/");
//		By loginExmaple = new ByChained(By.id("login-box"), By.id("user-name"));
//		WebElement username = driver.findElement(loginExmaple);
//		username.sendKeys("standard_user");
//		WebElement password = driver.findElement( new ByChained(By.id("login-box"), By.id("password"));
//		password.sendKeys("secret1");
		
//		By loginEx = new ByAll(By.id("user-name"), By.id("password"));
//		List<WebElement> login = driver.findElements(loginEx);
//		for(WebElement e : login) {
//			System.out.println("Element found : "e);
//		}
		
		By loginExmaple = new ByChained(By.className("login-box"), By.id("user-name"));
		WebElement username = driver.findElement(loginExmaple);
		username.sendKeys("admin_user");
		// Find an element with id "password" which is just below another element by id "user-name"
		//By passEx = RelativeLocator.with(By.id("password")).below(By.id("user-name"));
		By passEx = RelativeLocator.with(By.id("password")).below(username);
		WebElement pass = driver.findElement(passEx);
		pass.sendKeys("password");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		WebElement loginbtn = driver.findElement(By.id("login-button"));
//		loginbtn.click();
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		assertTrue(url.contains("/inventory.html"),"Expecting redirection to inventory page");
	}

}
