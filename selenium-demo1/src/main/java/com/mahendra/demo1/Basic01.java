package com.mahendra.demo1;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic01 {

	public static void main(String[] args) {
		System.out.println("Lanuching a new 'chrome' instance ...");
		WebDriver d1 = new ChromeDriver();
		d1.get("https://omayo.blogspot.com/");
		
		System.out.println("Launching a new 'firefox' instance ....");
		WebDriver d2 = new FirefoxDriver();
		d2.get("https://omayo.blogspot.com/");
		System.out.println("Press any key to close...");
		
		try {
			byte[] key=new byte[10];
			System.in.read(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d1.quit();
		d2.quit();	
	}
}
