package com.testUtil.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static long page_Load_TimeOut = 30;
	public static long implicitlyWait = 30;
	
	public static void takesScreenshot(WebDriver driver, String screenshot) {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		
		String currretDir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcFile, new File(currretDir +"/Screenshot/"+screenshot+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
