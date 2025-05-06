package com.vodafone.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findElement --> check for presence of element in 0.5s 
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		//click custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//20 Apr 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
		//selectMonth.selectByValue("4");
		//selectMonth.selectByIndex(3);
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
	}
}
