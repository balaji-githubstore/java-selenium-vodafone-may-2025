package com.vodafone.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo4SalesForce {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/sales-ee/");
		
		//enter firstname as john
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		//lastname as wick
		driver.findElement(By.name("UserLastName")).sendKeys("w");
		//job title as SQE
		driver.findElement(By.name("UserTitle")).sendKeys("SQE");
		
		//click next
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		//select employee as 21 - 200 employees 
		Select selectEmps=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmps.selectByVisibleText("21 - 200 employees");
		
		//click next 
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		//Get the error text and print it - Enter your company name

		String actualText= driver.findElement(By.xpath("//span[contains(normalize-space(),'your company')]")).getText();
		System.out.println(actualText);
		//will start at 4:20 PM IST
	}

}
