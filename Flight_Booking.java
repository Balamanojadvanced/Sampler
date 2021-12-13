package com.adv.Epma_Module;
import org.openqa.selenium.By;

//import resources.base;

public class Flight_Booking extends CommonMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonMethods commonobj = new CommonMethods();
		commonobj.LaunchApplication();
		
		commonobj.selectDropDown(driver.findElement(By.xpath("//select[@name='fromPort']")), "Boston");
		commonobj.selectDropDown(driver.findElement(By.xpath("//select[@name='toPort']")), "London");
		commonobj.clickElement(driver.findElement(By.xpath("//input[@value='Find Flights']")));
		commonobj.textComparision(driver.findElement(By.xpath("//div/h3[contains(text(),'Flights from')]")), "Flights from Boston to London:");
		commonobj.ElementisDisplayed(driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'Virgin America')]")));
		commonobj.clickElement(driver.findElement(By.xpath("//input[@value='Choose This Flight']")));
		commonobj.clickElement(driver.findElement(By.xpath("//input[@value='Purchase Flight']")));
		commonobj.textComparision(driver.findElement(By.xpath("//div/h1[contains(text(),'Thank you for your purchase today!')]")), "Please fill the Purchase Details");
	}
//new Select(base.driver.findElement(adminMethod));
}


