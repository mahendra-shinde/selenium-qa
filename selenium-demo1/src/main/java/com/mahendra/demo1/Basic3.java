package com.mahendra.demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
		d.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement table = d.findElement(By.id("table1"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> trs = tbody.findElements(By.tagName("tr"));
		System.out.println("Found "+trs.size());
		System.out.println("List of rows");
		for(WebElement e : trs) {
			System.out.println(e.getText());
			//System.out.println(e);
		}
		d.quit();
	}
}
