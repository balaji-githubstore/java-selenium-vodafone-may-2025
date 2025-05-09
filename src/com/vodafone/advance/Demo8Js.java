package com.vodafone.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo8Js {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		

		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		
		//approach 1 
		//driver.findElement(By.xpath("//input[@name='dateDeparture']")).sendKeys("04 Jun 2025");

		//approach 2 - try automate calendar 
		
		
		//appoach 3 -- js 
		//document.querySelector("input[name='dateDeparture']").value='28 Jun 2025'
		//document.querySelector("input[name='dateReturn']").value='28 Jun 2025'
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='28 Jun 2025'");
		
		js.executeScript("document.querySelector(\"input[name='dateDeparture']\").click()");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("error.png"));
		
	}

}








