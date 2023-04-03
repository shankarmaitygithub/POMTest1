package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Login() throws InterruptedException
	{
		
		username.sendKeys(prop.getProperty("username"));
		logger.info("Enter Username");
		password.sendKeys(prop.getProperty("password"));
		logger.info("Enter Password");
		loginbtn.click();
		Thread.sleep(3000);
		logger.info("Click on Login button");
		
		
	}
	
	
	
	
	
	
	
	

}
