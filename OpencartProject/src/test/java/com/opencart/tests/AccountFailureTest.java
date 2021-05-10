package com.opencart.tests;


	import java.io.IOException;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.opencart.pages.CreateAccount;
	import com.opencart.utils.BaseClass;
	
	public class AccountFailureTest extends BaseClass
	{
		
		public String path=("user.dir")+"//OpencartProject//Snapshots";
		
		@BeforeTest
		public void bTest() throws IOException 
		{

			launchBrowser();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}

		@Test
		public void creatingAcnt() throws Throwable 
		{

			CreateAccount ca = new CreateAccount(driver);
			ca.fillCreateaccountForm
			(prop.getProperty("firstname"), 
			 prop.getProperty("lastname"), 
			 prop.getProperty("emailid"),
			 prop.getProperty("phoneno"), 
			 prop.getProperty("password"), 
			 prop.getProperty("confirmpassword"));
			
			ca.clickSubmit();
			
			screenShot(path + "\\FailurePicture.png");
		}

		@AfterTest
		public void aTest() 
		{
			driver.close();
		}
}

