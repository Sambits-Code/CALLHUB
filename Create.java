package com.sambit.callhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create 
{
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Create(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//Locator for login button
	By CreateBtn = By.xpath("//a[contains(text(),'Create Account')]");
	By enteremail = By.id("fld_5958566_2");
	By Createfreeaccount = By.id("fld_3463269_2");
	
	//Method to click Create account button
	public void clickCreateaccount() 
	{
		driver.findElement(CreateBtn).click();
	}
	public void enteremailid(String user)
	{
		driver.findElement(enteremail).sendKeys(user);
	}
	public void clickCreatefreeaccount() 
	{
		driver.findElement(Createfreeaccount).click();
		
	}

}
