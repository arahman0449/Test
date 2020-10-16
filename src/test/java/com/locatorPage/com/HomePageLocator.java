package com.locatorPage.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testUtil.demo.TestBase;

public class HomePageLocator extends TestBase {

	public HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="user-name")
	public WebElement username;
	
	@FindBy(how=How.ID, using="password")
	public WebElement password;
	
	@FindBy(how=How.ID, using="login-button")
	public WebElement loginButton;
	
	@FindBy(how=How.XPATH, using="//div[text()='Sauce Labs Backpack']")
	public WebElement backpack;
	
	@FindBy(how=How.CSS, using="div.inventory_details_desc")
	public WebElement productInfo;
	
	@FindBy(how=How.XPATH, using="//div[text()='Sauce Labs Fleece Jacket']")
	public WebElement jacket;
	
	@FindBy(how=How.XPATH, using="//button[text()='ADD TO CART']")
	public WebElement addToCart;
	
	@FindBy(how=How.XPATH, using="//span[text()='1']")
	public WebElement cart;
	
	@FindBy(how=How.XPATH, using="//a[text()='CHECKOUT']")
	public WebElement checkoutButton;
	
	@FindBy(how=How.ID, using="first-name")
	public WebElement firstName;
	@FindBy(how=How.ID, using="last-name")
	public WebElement lastName;
	@FindBy(how=How.ID, using="postal-code")
	public WebElement zip;
	
	@FindBy(how=How.CSS, using="input[type='Submit']")
	public WebElement continueSubmit;
	
	@FindBy(how=How.XPATH, using="//a[text()='FINISH']")
	public WebElement finishOrder;
	
	@FindBy(how=How.XPATH, using="//h2[text()='THANK YOU FOR YOUR ORDER']")
	public WebElement orderConfirmation;
}
