package com.pom.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.base.TestBase;
import com.pom.pages.LoginPage;
import com.pom.utils.TestUtils;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialise();
		loginpage = new LoginPage();
	}
	
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		loginpage.Login();
		String title=driver.getTitle();
		System.out.println(title);
//		Assert.assertEquals(title, "Guru99 Bank Manager HomePage", "Title not match");
		if(title.equals("Guru992 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Pass");
		}
		else
		{
			logger.info("Login Test Fail");
			TestUtils.CaptureScreenshot();
			Assert.assertTrue(false);	
		}
	}
	
	@Test
	public void loginTest1() throws InterruptedException, IOException
	{
		loginpage.Login();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage", "Title not match");
		if(title.equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Pass");
		}
		else
		{
			logger.info("Login Test Fail");
			TestUtils.CaptureScreenshot();
			Assert.assertTrue(false);	
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	

}
