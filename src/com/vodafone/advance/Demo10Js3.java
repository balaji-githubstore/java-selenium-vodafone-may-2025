package com.vodafone.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo10Js3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://online-video-cutter.com/");
		

//		driver.findElement(By.xpath("//a[normalize-space()='Change Pitch']")).click();
		
		//click on hidden element 
		
		//Option 2 js 
		WebElement ele1= driver.findElement(By.xpath("//a[normalize-space()='Change Pitch']"));
		js.executeScript("arguments[0].click()",ele1);
		
		WebElement ele2= driver.findElement(By.xpath("//a[normalize-space()='Change Volume']"));
		js.executeScript("arguments[0].click()",ele2);
		
		//not recommended to club js 
//		js.executeScript("arguments[0].click();arguments[1].value='sss'",ele1,ele2);
	}

}








