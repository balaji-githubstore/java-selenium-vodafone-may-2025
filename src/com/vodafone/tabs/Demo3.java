package com.vodafone.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//dealing with more than 2 tabs 
public class Demo3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin »
		driver.findElement(By.xpath("//b[contains(normalize-space(),'phpMyAdmin')]")).click();
		
		//switch tab using title
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());

		System.out.println(windows);

		for(String window : windows)
		{
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			System.out.println("--------------------------------");
		}
	}

}
