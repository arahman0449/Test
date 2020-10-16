package com.action.demo;

import org.testng.Assert;

import com.locatorPage.com.HomePageLocator;
import com.testUtil.demo.TestBase;
import com.testUtil.demo.Utility;

public class HomePageAction extends TestBase{

	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void userCredentials( String u, String p) throws InterruptedException {
		homePageLocator.username.sendKeys(u); 
		Thread.sleep(2000);
		homePageLocator.password.sendKeys(p);
		Thread.sleep(3000);
		homePageLocator.loginButton.click();
	}
	
	public void clickOnBackPack() throws InterruptedException {
		Thread.sleep(3000);
		homePageLocator.backpack.click();
	}
	
	public void productInfo() throws InterruptedException {
		Thread.sleep(3000);
		boolean verifyResult = homePageLocator.productInfo.isDisplayed(); // new code 
		Assert.assertTrue(verifyResult);
		Utility.takesScreenshot(driver, "product-info");
		Thread.sleep(3000);
	}
	
	
	public void cickOnJacket() throws InterruptedException {
		Thread.sleep(2000);
		homePageLocator.jacket.click();
	}
	
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		homePageLocator.addToCart.click();
	}
	
	public void clickOnCart() throws InterruptedException {
		Thread.sleep(1000);
		homePageLocator.cart.click();
	}
	
	public void clickOnCheckout() {
		homePageLocator.checkoutButton.click();
	}
	
	public void enterCredentials() throws InterruptedException {
		
		homePageLocator.firstName.sendKeys(pro.getProperty("firstName"));
		Thread.sleep(1000);
		homePageLocator.lastName.sendKeys(pro.getProperty("lastName"));
		Thread.sleep(1000);
		homePageLocator.zip.sendKeys(pro.getProperty("zip"));
		Thread.sleep(2000);
		homePageLocator.continueSubmit.click();
	}
	
	public void finishOrder() throws InterruptedException {
		Thread.sleep(1000);
		homePageLocator.finishOrder.click();
		Thread.sleep(3000);
	}
	
	public void orderConfirmation() throws InterruptedException {
		boolean verification= homePageLocator.orderConfirmation.isDisplayed();
		Assert.assertTrue(verification);
		Utility.takesScreenshot(driver, "order-confirmation");
		Thread.sleep(3000);
		
	}
	

}
