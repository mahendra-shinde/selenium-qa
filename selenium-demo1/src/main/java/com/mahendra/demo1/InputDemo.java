package com.mahendra.demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		WebElement form = driver.findElement(By.name("form1"));
		List<WebElement> fields = form.findElements(By.tagName("input"));
		fields.get(0).sendKeys("mahendra");
		fields.get(1).sendKeys("password@1234");
		WebElement button = form.findElement(By.tagName("button"));
		button.click();
		driver.quit();

	}

}
