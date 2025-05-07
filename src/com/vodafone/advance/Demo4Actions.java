package com.vodafone.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://online-video-cutter.com/");
		
		Actions actions=new Actions(driver);
		
		//mousehover on PDF
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='PDF']"))).perform();
		
		//mousehover on Convert to pdf 
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Convert to PDF']"))).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Word to PDF']")).click();
		
	}

}
