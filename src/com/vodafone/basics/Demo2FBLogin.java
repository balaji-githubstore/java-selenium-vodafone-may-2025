package com.vodafone.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		By loc = By.id("email");
		WebElement ele = driver.findElement(loc);
		ele.sendKeys("hello123444@gmail.com");

		// driver.findElement(By.id("email")).sendKeys("hello123444@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("welcom2333");

		// click on login
		driver.findElement(By.name("login")).click();
	}

}
