package com.adv.Epma_Module;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import resources.LibraryFile;
import resources.base;

public class CommonMethods {
	public static WebDriver driver;
	public static String url="https://blazedemo.com/";
	public static String browserName = "chrome";
	public void LaunchApplication()
	{
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");		
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//IEDriverServer.exe");		
			driver = new InternetExplorerDriver();
			
		} 
		else
		{
			
		}
		driver.get(url);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if(driver.getTitle().equals("BlazeDemo"))
		{
			System.out.println("Pass - Application is launched successfully "+url);			
			
		}
		else
		{
			System.out.println("Fail - Application is launched successfully "+url);		
		}
	}
	
	
	public void selectDropDown(WebElement element, String val)
	{
		Select selDropdown = new Select(element);
		
		if(element!=null)
    	{	
	       
			selDropdown.selectByVisibleText(val);     
       
    	}
        else{
        	System.out.println("Fail - You are getting No Such Element Exception as element is null for dropdown "+element);	
    	}
	}
	
	public void enterInputText(WebElement element, String ipData){
	   
	    	if(element!=null)
	    	{
	    	element.clear();    
	       
	        element.sendKeys(ipData);		 
		    element.sendKeys(Keys.TAB);
		    
		    
	    	}
	    	else {
	    		System.out.println("Fail - You are getting No Such Element Exception as element is null for textbox "+element);	
	    	}
		    
	}
	
	public void clickElement(WebElement element){
	    
	    	if(element!=null)
	    	{	
		        element.click();
			  
	    	}
	    	else {
	    		System.out.println("Fail-You are getting No Such Element Exception as element is null "+element); 
	    	}
	   
	   
	}

	public void textComparision(WebElement element1,String expOutput)
	{
		if(element1.getText().equals(expOutput))
		{
			
			System.out.println("Pass- expected text is displayed"+element1.getText()); 
		}
		else
		{
			
			System.out.println("Fail- expected text is not displayed"+expOutput); 
		}
		
	}
	
	public void ElementisDisplayed(WebElement element1)
	{
		if(element1.isDisplayed())
		{
			
			System.out.println("Pass- expected text is displayed"+element1.getText()); 
		}
		else
		{
			
			System.out.println("Fail- expected text is displayed"+element1.getText()); 
		}
		
	}
}
