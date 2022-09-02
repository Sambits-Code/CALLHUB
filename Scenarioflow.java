package com.QA.callhub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sambit.callhub.Create;
import com.sambit.callhub.Dashboard;
import com.sambit.callhub.Home;
import com.sambit.callhub.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenarioflow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://callhub.io/");
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Creating object of home page
		Home home = new Home(driver1);

		// Creating object of Login page
		Login login = new Login(driver1);

		// Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver1);
		
		// Creating object of Create
		Create create = new Create(driver1);

		// Click on Create account  button
		create.clickCreateaccount();
		create.enteremailid("karmakarsuman887@gmail.com");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.xpath("//input[@id='fld_1801632_2_opt1743266']")).click();
		create.clickCreatefreeaccount();
		
		// Click on Login button
		home.clickLogin();

		// Enter username & password
		//login.enterUsername("---Your Username---");
		login.enterPassword("Suman@12345");

		// Click on login button
		login.clickLogin();
		//Thread.sleep(3000);
		
		dashboard.createbroadcast();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//dashboard.createphonebook();
		
		dashboard.addcustomerfromthelist();
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[contains(text(),'Sumana')]")).click();
		Thread.sleep(500);
		driver1.findElement(By.xpath("//body/section[@id='index']/div[@id='app-container']/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/*[1]")).click();
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[contains(text(),'Demo phonebook')]")).click();
		Thread.sleep(500);
		driver1.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).click();
        driver1.findElement(By.xpath("//body/section[@id='index']/div[@id='app-container']/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("MAHADEV");
        driver1.findElement(By.xpath("//button[contains(text(),'next')]")).click();
        Thread.sleep(1500);
        driver1.findElement(By.xpath("//textarea[@id='message-textarea']")).sendKeys("Hello ! WELCOME TO CALLHUB.....");
        System.out.println("Message Sent Sucessfully !!!");
        driver1.findElement(By.xpath("//button[contains(text(),'next')]")).click();
        driver1.findElement(By.xpath("//button[contains(text(),'next')]")).click();
        driver1.findElement(By.xpath("//button[contains(text(),'next')]")).click();
        driver1.findElement(By.xpath("//button[contains(text(),'finish')]")).click();
        driver1.findElement(By.xpath("//body/section[@id='index']/div[@id='app-container']/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
	
        // Click on Logout button
		//dashboard.clickLogout();

		// Close browser instance*/
		//driver1.close();
	}
}
