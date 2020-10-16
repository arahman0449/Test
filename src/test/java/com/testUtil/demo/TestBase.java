package com.testUtil.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;
	
	public TestBase() {
		pro = new Properties();
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir") + "./src/test/java/com/config/demo/config.properties" );
			pro.load(fls);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		String browserName = pro.getProperty("browser");
		
		if(browserName.equals("CC")) {
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Webdriver\\chromedriver.exe");
		      driver = new ChromeDriver();
			  driver.manage().window().maximize();
		      driver.manage().timeouts().pageLoadTimeout(Utility.page_Load_TimeOut, TimeUnit.SECONDS); 
		      driver.manage().timeouts().implicitlyWait(Utility.implicitlyWait, TimeUnit.SECONDS);
		      
		}
		else if(browserName.equals("FF"));
	}
	
	public void getURL(String url) {
		driver.get(pro.getProperty("QAurl"));
	}


}
