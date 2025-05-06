package com.vodafone.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		

		//get the url and print it
		System.out.println(driver.getCurrentUrl());
		
		//get pagesource and print it
		String actualPageSource= driver.getPageSource();
		System.out.println(actualPageSource);
		
		
		//driver.quit();
	}

}
