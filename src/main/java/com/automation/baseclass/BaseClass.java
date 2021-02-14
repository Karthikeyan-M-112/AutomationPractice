package com.automation.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername)
	{
		 try {
		
				if(browsername.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
					 driver=new ChromeDriver();
				}
				else if(browsername.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver", "C:\\Users\\Karthik\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
					 driver=new InternetExplorerDriver();
				}
				
				else
				{
					System.out.println("Invalid Browser");
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
		


		
	
	public static void getUrl(String value)
	{
		try {
			driver.get(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void waitForElement(WebElement element)
	{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void clickOnElements(WebElement element)
	{
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void inputToElements(WebElement element,String value)
	{
	    waitForElement(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void selectDropDown(WebElement element,String options,String value) {
    	waitForElement(element);
    	try {
			Select s=new Select(element);
			if(options.equalsIgnoreCase("value"))
					{
				s.selectByValue(value);
					}
			if(options.equalsIgnoreCase("visibletext"))
			{
				s.selectByVisibleText(value);
			}
			if(options.equalsIgnoreCase("index"))
			{
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void mouseHover(WebElement element)
    
    {
    	waitForElement(element);
    	try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void keyPress() throws AWTException
    {
    	try {
			Robot rc=new Robot();
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void alert(String alertoptions, String value)
    {
    	Alert alert = driver.switchTo().alert();
    	if(alertoptions.equalsIgnoreCase("ok"))
    	{
    		alert.accept();
    	}
    	if(alertoptions.equalsIgnoreCase("cancel"))
    	{
    		alert.dismiss();
    	}
    	if (alertoptions.equalsIgnoreCase("textbox ok")) {
    		alert.sendKeys(value);
			
		}
    }
 
    

}



