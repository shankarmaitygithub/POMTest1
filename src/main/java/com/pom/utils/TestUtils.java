package com.pom.utils;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


import com.pom.base.TestBase;

public class TestUtils extends TestBase{
	
	
	
	public static void CaptureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String CurrentDirectory = System.getProperty("user.dir");
		File tergat = new File(CurrentDirectory+"/Screenshot/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(source, tergat);
		System.out.println("Screenshot taken");		
	}
	
	

}
