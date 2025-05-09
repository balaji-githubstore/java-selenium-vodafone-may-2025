package com.vodafone.advance;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo7Options {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
	}
}
