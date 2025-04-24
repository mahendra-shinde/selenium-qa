package com.mahendra.demo1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Basic4 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
		d.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement body = d.findElement(By.tagName("body"));
		File file = body.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File("d:/temp2/pic2.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.quit();
	}
}
