package com.opencart.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencart.utils.BaseClass;

public class LoginAccount extends BaseClass
{
		WebDriver driver;
	    Properties prop;
	    BaseClass configfile;
	   
	  
		public LoginAccount(WebDriver driver) 
		{
			this.driver=driver;
		}
		 
				
		public void fillLogin(String EmailAddress, String Password) 
		{
			configfile = new BaseClass();
		       prop = configfile.init_prop();
		   
		      driver.findElement(By.xpath(prop.getProperty("MyAccount_button_xpath"))).click();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		      driver.findElement(By.xpath(prop.getProperty("Login_button_xpath"))).click();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			  driver.findElement(By.xpath(prop.getProperty("Login_Email_id_xpath"))).sendKeys(EmailAddress);
			  driver.findElement(By.xpath(prop.getProperty("Login_Password_xpath"))).sendKeys(Password);
		}
		

		public void clickSubmit() {
			configfile = new BaseClass();
		    prop = configfile.init_prop();
			driver.findElement(By.xpath(prop.getProperty("Login_submit_button_xpath"))).click();
		}
}
