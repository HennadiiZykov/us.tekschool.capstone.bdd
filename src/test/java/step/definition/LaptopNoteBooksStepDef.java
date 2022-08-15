package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;

import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilites.Utils;

public class LaptopNoteBooksStepDef extends Base {

	LaptopNoteBooksPageObject lapTopNoteBooksObj = new LaptopNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapTopNoteBooksObj.clickLaptopsAndNoteBooksTabButton();
		Utils.hardWait(2000);
	}

	@When("User clickon Show all Laptop &NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		lapTopNoteBooksObj.clickShowAllLaptopsAndNotebooksButton();
		Utils.hardWait(2000);
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		lapTopNoteBooksObj.clickMacBookItem();
		Utils.hardWait(2000);

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapTopNoteBooksObj.clickShoppingCard();
		Utils.hardWait(2000);
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String successMessage) {
		Assert.assertEquals(lapTopNoteBooksObj.AddItemCardMessage(), successMessage);
		Utils.hardWait(2000);
	}

	@Then("User should see {string} to the cart")
	public void user_should_see_to_the_cart(String successMessage) {

		Assert.assertEquals(lapTopNoteBooksObj.InfoTextShoppingCard(), successMessage);
		Utils.hardWait(2000);
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapTopNoteBooksObj.clickItemRemoveButton();
		Utils.hardWait(2000);
	}

	@Then("item should be removed and cart should show {string} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(String successMessage) {
		Assert.assertEquals(lapTopNoteBooksObj.getItemTextInfoAfterRemove().substring(0, 1), successMessage);
		Utils.hardWait(2000);
		   Utils.takeScreenShot();
	}

// ---------------------  @ProductComparison  -------------------------

	@Given("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapTopNoteBooksObj.clickLaptopsAndNotebooksTopLink();
		Utils.hardWait(2000);
	}

	@Given("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		lapTopNoteBooksObj.clickShowAllLaptopsAndNotebooksButton();
		lapTopNoteBooksObj.clickComparisonIconMacBook();
		Utils.hardWait(2000);
	}

	@Given("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		lapTopNoteBooksObj.clickComparisonIconMacBookAir();
		
		Utils.hardWait(2000);

	}
	@Then("User should see a message MacBook Air {string}")
	public void user_should_see_a_message_mac_book_air(String successMessage) {
		Assert.assertEquals(lapTopNoteBooksObj.ComparisonMessageMacBookAir(), successMessage);
		Utils.hardWait(2000);
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		lapTopNoteBooksObj.clicklinkProductComparison();
		Utils.hardWait(2000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		List<WebElement> desktopsElements = lapTopNoteBooksObj.ListProductComparsonChart();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present");
			Utils.hardWait(2000);
			   Utils.takeScreenShot();
		
		}
	}
//-------------------------------@AddingToWishlist  
	@When("User click on Laptop and NoteBook tab")
	public void user_click_on_laptop_and_note_book_tab() {
		lapTopNoteBooksObj.clickLaptopsAndNoteBooksTabButton();
		Utils.hardWait(2000);
	}

	@When("User click on Show all Laptop and NoteBook option")
	public void user_click_on_show_all_laptop_and_note_book_option() {
		lapTopNoteBooksObj.clickShowAllLaptopsAndNotebooksButton();
		Utils.hardWait(2000);
	}

	@When("User click on heart icon to add `Sony VaIO` laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		lapTopNoteBooksObj.ClickAddSonyVaIOtoWishList();
		Utils.hardWait(2000);
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String successMessage) {
		Assert.assertEquals(lapTopNoteBooksObj.getMessageSonyVAIO(), successMessage);
		Utils.hardWait(2000);
		   Utils.takeScreenShot();
	}
	
	//--------------------------@ValidateThePrice---------------------
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		lapTopNoteBooksObj.clickMakbookProItem();
		Utils.hardWait(2000);
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String successMessage) {
		Assert.assertEquals(lapTopNoteBooksObj.getTextMakbookProPrice(), successMessage);
		Utils.hardWait(2000);
		   Utils.takeScreenShot();
	}
	
	
	
	
	
}