package com.opencart.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.pages.LoginAccount;
import com.opencart.utils.BaseClass;

public class LoginTest extends BaseClass
{
	@BeforeTest
	public void bTest() throws IOException 
	{

		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void loginAcnt() throws Throwable 
	{

		LoginAccount la = new LoginAccount(driver);
		la.fillLogin(prop.getProperty("emailid"),prop.getProperty("password"));
		la.clickSubmit();
	}

	@AfterTest
	public void aTest() 
	{
		//driver.close();
	}
}
