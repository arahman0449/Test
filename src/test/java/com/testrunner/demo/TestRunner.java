package com.testrunner.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.testUtil.demo.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"./src/test/resources/Features/home.feature"},
format= {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue= "stepdifination", tags= {"@Order"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void setUp(){
		TestBase test = new TestBase();
		test.initialization();
	}
	
	@AfterTest
	public void tearDown() {
		
		TestBase.driver.quit();
	}
}
