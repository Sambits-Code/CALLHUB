package com.sambit.callhub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dashboard 
{
	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public Dashboard(WebDriver driver) 
	{
		this.driver = driver;
	}

	// Create text Broadcasting
	By CreateTextBroadcast = By.xpath("//body/section[1]/section[1]/div[1]/div[1]/div[5]/div[1]/div[2]/a[1]");
	By Addphonebook = By.xpath("//a[contains(text(),'+Add a phonebook')]");
	By addcustomerfromthelist = By.xpath("//div[contains(text(),'Select 1 or multiple phonebooks')]");
	// By Createphonebook = By.xpath("//a[contains(text(),'Create phonebook')]");
	// By phonebookname =
	// By.xpath("//body/section[1]/div[6]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");

	// Method to create broadcast text
	public void createbroadcast() 
	{
		driver.findElement(CreateTextBroadcast).click();
	}

	public void addcustomerfromthelist() 
	{
		driver.findElement(addcustomerfromthelist).click();
		List<WebElement> allOptions = driver.findElements(By.xpath("//body/section[@id='index']/div[@id='app-container']/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/*[1]"));
        System.out.println(allOptions.size());
        for(int i = 0; i<=allOptions.size()-1; i++) 
        {
            if(allOptions.get(i).getText().contains("Demo phonebook")) 
            {
                allOptions.get(i).click();
                break;
            }
        }
	}
	public void handledateandtime ()
	{
//		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
//
//        //Fill date as mm/dd/yyyy as 09/25/2013
//
//        dateBox.sendKeys("09252013");
//
//        //Press tab to shift focus to time field
//
//        dateBox.sendKeys(Keys.TAB);
//
//        //Fill time as 02:45 PM
//
//        dateBox.sendKeys("0245PM");
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);

		 // Print the Date
		 System.out.println("Current date and time is " +date1);
		 
		 }
    
	}
        
        
       
		//Select dropDown = new Select(driver.findElement(By.linkText("Sumana")));
		
//		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
//		WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Demo phonebook')]"))).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Demo phonebook')]"))).click();
//		Select oSel = new Select(driver.findElement(By.xpath("//div[contains(text(),'Sumana')]")));
//		Select oSel1 = new Select(driver.findElement(By.xpath("//div[contains(text(),'Demo phonebook')]")));
//		List<WebElement> selectedOptions = oSel.getAllSelectedOptions();
//		List<WebElement> selectedOptions1 = oSel1.getAllSelectedOptions();
//		oSel.selectByVisibleText("Sumana");
//		oSel.selectByVisibleText("Demo phonebook");
	
//	private FluentWait<WebDriver> WebDriverWait(WebDriver driver2, int i) 
//	{
//		
//		return null;
//	}
	/*
	 * public void addcustomertophonebook() {
	 * driver.findElement(Addphonebook).click(); } Set<String> windows =
	 * driver.getWindowHandles(); {
	 * 
	 * for (String window : windows) { driver.switchTo().window(window); if
	 * (driver.getTitle().contains("Phonebooks")) {
	 * System.out.println("Please enter phonebook name"); } } }
	 */
	/*
	 * public void createphonebook() { String parent = driver.getWindowHandle();
	 * 
	 * //driver.findElement(Createphonebook).click();
	 * driver.findElement(By.xpath("//a[contains(text(),'Create phonebook')]"));
	 * 
	 * Set<String> allwindows=driver.getWindowHandles();
	 * 
	 * int count = allwindows.size();
	 * System.out.println("Total Number of window"+count); for(String
	 * child:allwindows) { if(!parent.equalsIgnoreCase(child)) {
	 * driver.switchTo().window(child);
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); } }
	 * driver.switchTo().window(parent); }
	 * 
	 * public void addnametophonebook() {
	 * driver.findElement(phonebookname).sendKeys("SUGARY HEAVEN");
	 * 
	 * driver.findElement(By.id("create-phonebook-btn")).click(); }
	 */

