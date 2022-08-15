package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.DesktopsPageObject;
import utilites.Utils;

public class DesktopsStepDef extends Base {

	DesktopsPageObject desktopPage = new DesktopsPageObject();
	// syntax @Tag("exact words of step from scenario")
	// public void nameOfTheMethod(){}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {

		desktopPage.clickonDesktopsTab();
		logger.info("User clicked on Desktops tab");
		

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {

		desktopPage.clickOnShowAllDesktop();
		logger.info("user clicked on show all desktops");
		
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present");
			
		}
	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPage.clickOnHpLp3065();
		logger.info("User cliced Add to Cart Option");
		Utils.hardWait(2000);
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("Usr selected quantity " + string);
		Utils.hardWait(2000);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCardButton();
		logger.info("User clicked add to cart button");
		Utils.hardWait(2000);

	}

	@Then("User should see a message{string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPage.successMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + "equals to " + desktopPage.successMessage());
		Utils.takeScreenShot();
		Utils.hardWait(1000);
	}

//
//		@Then("User should see a message {string}")
//		public void user_should_see_a_message(String  expectedSuccessMessage) {
//		    Assert.assertEquals(desktopPage.successMessage(), expectedSuccessMessage);
//		    logger.info(expectedSuccessMessage + "equals to " + desktopPage.successMessage() );
//		    Utils.takeScreenShot();
//		    Utils.hardWait(1000);
//		}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPage.clickCanonEOS5DCamera();
		logger.info("User cliced Add to Cart Option");
		Utils.hardWait(2000);
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.clikcSelectColorDropDownMenu();
		desktopPage.clickSelectCollorItem();
		logger.info("User selected color from dropdown Red");
		Utils.hardWait(2000);

	}

	@Then("User should see a message1{string}")
	public void user_should_see_a_message1(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPage.CanonSuccessMessage(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + "equals to " + desktopPage.CanonSuccessMessage());
		Utils.takeScreenShot();
		Utils.hardWait(1000);
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickCanonEOS5DCamera();
		logger.info("User clicked on Canon EOS 5D item");
		Utils.hardWait(1000);
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickWriteReviewLink();
		logger.info("User clicked on write a review link");
		Utils.hardWait(1000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		desktopPage.WriteYourNameField(information.get(0).get("yourname"));
		desktopPage.WriteReviewField(information.get(0).get("yourReview"));
		desktopPage.selectRating(information.get(0).get("Rating"));
		logger.info("User fill the review information with below information");
		Utils.hardWait(1000);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickReviewContinuButton();
		logger.info("User clicked on Continue Button");
		Utils.hardWait(1000);
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String expectedSuccessMessage) {
		desktopPage.ReviewSuccessMessage();
		Utils.takeScreenShot();
		Utils.hardWait(2000);
		
		

	}

	// step 1 we need to store the element in a list
	// step 2 we need to iterate through the list
	// step 3 we need to write an assertion to validate element (index)
	// is present

}
