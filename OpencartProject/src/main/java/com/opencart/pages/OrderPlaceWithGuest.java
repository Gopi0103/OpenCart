package com.opencart.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencart.utils.BaseClass;

public class OrderPlaceWithGuest extends BaseClass
{
	WebDriver driver;
    Properties prop;
    BaseClass configfile;
   
  
	public OrderPlaceWithGuest(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public void Billing(String EmailAddress, String Password, String Date) 
	{
		configfile = new BaseClass();
	       prop = configfile.init_prop();
	   
	      driver.findElement(By.xpath(prop.getProperty("Laptops&Notebooks_xpath"))).click();
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	      driver.findElement(By.xpath(prop.getProperty("Show_all_laptops&notebooks_xpath"))).click();
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath(prop.getProperty("HPLP3065_xpath"))).click();		  
		  driver.findElement(By.xpath(prop.getProperty("Date_xpath"))).sendKeys(Date);
		  driver.findElement(By.xpath(prop.getProperty("AddtoCart_button_xpath"))).click();	
		  driver.findElement(By.xpath(prop.getProperty("Itembasket_button_xpath"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Checkout_button_xpath"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Guest_radio_button_xpath"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Continue_button_xpath"))).click();
	}
}