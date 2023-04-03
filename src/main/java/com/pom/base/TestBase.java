package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.pom.utils.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public TestBase()
	{
		
		
				
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Shankar Maity\\eclipse-workspace\\POMTest\\src\\main\\java\\com\\pom\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
	  
	  
	}
	
	public static void initialise()
	{
			
		
		
		logger = Logger.getLogger("POMTest");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar Maity\\eclipse-workspace\\POMTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		logger.info("Lunch URL");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
