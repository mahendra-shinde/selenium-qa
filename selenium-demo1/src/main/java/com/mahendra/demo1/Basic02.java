package com.mahendra.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic02 {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://omayo.blogspot.com/");
		String title = d.getTitle();
		if (title.contains("omayo")) {
			System.out.println("Correct Page loaded!");
		} else {
			System.out.println("Its not omaya's blog!");
		}
		int h1 = d.findElements(By.tagName("h1")).size();
		System.out.println("Page has " + h1 + " H1 tag");
		d.quit();
	}
}
