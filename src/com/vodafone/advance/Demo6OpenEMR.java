package com.vodafone.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6OpenEMR {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.cssSelector("#authUser")).sendKeys("jack2228");
		
// Navigate onto http://demo.openemr.io/b/openemr/ 
//Update username as admin 
//Update password as pass 
//Select language as English (Indian) 
//Click on the login button 
//Click on Patient  Click New Search 
//Add the first name, last name 
//Update DOB as today's date  
//driver.findElement(By.id("form_DOB")).sendKeys("2024-01-12"); 

		
		
		
	}

}
