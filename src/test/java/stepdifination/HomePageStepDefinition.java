package stepdifination;

import com.action.demo.HomePageAction;
import com.testUtil.demo.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition extends TestBase {

HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
		getURL(url);
	}
	
	@Then("^Enter credentials and click login$")
	public void enter_credentials_and_click_login() throws Throwable {
		homePageAction.userCredentials(pro.getProperty("username"), pro.getProperty("password"));
	}

	@Then("^Click on Sauce Labs Backpack$")
	public void click_on_Sauce_Labs_Backpack() throws Throwable {
		homePageAction.clickOnBackPack();
	}

	@Then("^Verify Backpack product info$")
	public void verify_Backpack_product_info() throws Throwable {
		homePageAction.productInfo();
	}
	
	
	///// code for adding product to cart
	
	
	@Then("^Click on Fleece Jacket$")
	public void click_on_Fleece_Jacket() throws Throwable {
		homePageAction.cickOnJacket();
	}

	@Then("^Add Items to the Cart$")
	public void add_Items_to_the_Cart() throws Throwable {
		homePageAction.addToCart();
	}

	@Then("^Click on cart$")
	public void click_on_cart() throws Throwable {
		homePageAction.clickOnCart();
	}

	@Then("^Click on CheckoutButton$")
	public void click_on_CheckoutButton() throws Throwable {
		homePageAction.clickOnCheckout();
	}

	@Then("^Plugin cutomer data and click continue$")
	public void plugin_cutomer_data_and_click_continue() throws Throwable {
	    homePageAction.enterCredentials();
	}

	@Then("^Click on finish order$")
	public void click_on_finish_order() throws Throwable {
	    homePageAction.finishOrder();
	}
	
	@Then("^Verify order was placed$")
	public void verify_order_was_placed() throws Throwable {
		homePageAction.orderConfirmation();
	}
}
