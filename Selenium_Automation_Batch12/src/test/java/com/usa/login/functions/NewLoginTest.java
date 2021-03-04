package com.usa.login.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLoginTest {
	
	public static void main(String[] args) {		                   
	 
	System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Downloads/chromedriver");
	// select set property after System.
    // Interface  Object   Java keyword & chrome is a Class
	  WebDriver driver  =  new ChromeDriver();  // Up-casting 
		
       // 2. How you enter the URL ? By driver.get method and driver.anvigate method
	 //  driver.get("https://www.facebook.com/"); // To open URL or web page directly 
	   driver.get("https://www.ups.com/"); // To open URL or webpage directly by click button
	 // driver.navigate().to("https://www.facebook.com/");//To go forward & backward and refresh webpage
	 // driver.navigate().back(); // to back webpage
	 // driver.navigate().forward();// to forward webpage
	 //driver.navigate().refresh();// to refresh
    // 4. How to maximize the browser? see as below:
	  //  driver.manage().window().maximize(); // to maximize the webpage
	  // driver.quit(); // driver.quit method to close the browser and server
	 //driver.close();// driver.close method only to close the browser 
	   //and help to close IE(internet explorer) browser
	  
	  // How to find the web-element ? By driver.findelement and by driver.findelements
	  
	//  driver.findElement(By.partialLinkText("Sign up / Log in")).click(); //by locator partialLinkText for click 
	   driver.findElement(By.linkText("Sign Up")).click();// /by LinkText for click
	 driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
	  driver.findElement(By.id("pwd")).sendKeys("SAYEDawan2008");
	  driver.findElement(By.id("submitBtn")).click();
	//  System.out.println(driver.getTitle()); // to verify the page
	// what is the difference between find element and find elements
	// find element - for one element, find elements - for more than one element
	  
	 System.out.println(driver.getTitle()); // to verify the page 
	   
	  // How to close the browser  
	   driver.quit();
	  // driver.close();
	  // driver.findElement(By.partialLinkText("Sign up / Log in")).click();
	   
	   
	}
}
