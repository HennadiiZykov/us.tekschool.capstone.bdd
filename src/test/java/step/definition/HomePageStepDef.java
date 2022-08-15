package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.HomePageObj;
import utilites.Utils;

public class HomePageStepDef extends Base{

	HomePageObj homePageObject = new HomePageObj();
	
	//Scenario @TestCurrency
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickCurrencyDropDownButton();
		logger.info("click on Currency successfuly");
		Utils.hardWait(2000);
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.clickEuroButton();
		logger.info("Chose Euro from dropdown successfuly");
		Utils.hardWait(2000);
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	   String expectedText = "€";
	   String actualText = homePageObject.getTextCurrenceEuro();
	   Assert.assertEquals(expectedText, actualText);
	   logger.info("currency value should change to Euro successfuly");
	   Utils.hardWait(2000);
	   Utils.takeScreenShot();
	}

	//Scenario  @TestMessageShopingCart
	
	@Given("User is on Retail websiteWhen User click on shopping cart")
	public void user_is_on_retail_website_when_user_click_on_shopping_cart() {
		homePageObject.clickShopingCartButton();
		logger.info("click successfuly");
		Utils.hardWait(2000);
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	    String expectedText = "Your shopping cart is empty!";
	    String actualText = homePageObject.getTextMessageAfterClickOnCart();
	    Assert.assertEquals(expectedText,actualText);
	    logger.info("“Your shopping cart is empty!” message Checked successfuly  = " + homePageObject.getTextMessageAfterClickOnCart());
	    Utils.hardWait(2000);
	    Utils.takeScreenShot();
	}
	
	
}
