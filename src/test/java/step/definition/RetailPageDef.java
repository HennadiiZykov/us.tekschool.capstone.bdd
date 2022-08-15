package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RegisterPageObject;
import page.objects.RetailPageObject;
import utilites.Utils;

public class RetailPageDef extends Base{

	RetailPageObject RetailObj = new RetailPageObject();
	RegisterPageObject registerPage = new RegisterPageObject();
	
	// Background: Login on Website
	@Given("I am on Test Envirement Home Page")
	public void i_am_on_test_envirement_home_page() {
	String expectedText = "TEST ENVIRONMENT";
	String actualText = RetailObj.getEnvirementText();
	Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Envirement was verified");
	}

	@When("I click My Account Button")
	public void i_click_my_account_button() {
		
		RetailObj.clikOnMyAccountButton();
		Utils.hardWait(1000);
	}

	@When("I click Drop Down Menu Login Button")
	public void i_click_drop_down_menu_login_button() {
		
		RetailObj.clickDropLoginButton();
		Utils.hardWait(1000);
	}

	@When("I Enter username {string} and password {string}")
	public void i_enter_username_and_password(String email, String password) {
		
		RetailObj.enterEmail(email);
		RetailObj.enterPassword(password);
		logger.info("Email and Password were entered successfylly");
		Utils.hardWait(1000);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		
		RetailObj.clickLoginButton();
		logger.info("Login was clicked successfuly");
		Utils.hardWait(1000);
	}

	@Then("I am logged entro my test Enviroment account")
	public void i_am_logged_entro_my_test_enviroment_account() {
	   String expectedText = "My Account";
	   String actualText = RetailObj.getTextAfterLogin();
	   Assert.assertEquals(expectedText,actualText);
	   logger.info("My Account was verified successfuly");
	   Utils.hardWait(1000);
	   Utils.takeScreenShot();
	   
	}
	// This scenario "@EditAffiliateInformation"
	@When("User click on ‘Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		RetailObj.clikEditYourAffilateInformation();
		logger.info("Clicked on (Edit your affiliate information link) - successfuly");
		Utils.hardWait(1000);
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		RetailObj.clickBankTransferRadioBut();
		Utils.hardWait(1000);
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable){
		List<Map<String,String>> information = dataTable.asMaps(String.class,String.class);
		RetailObj.enterBankNameField(information.get(0).get("bankName"));
		RetailObj.enterABANumberField(information.get(0).get("abaNumber"));
		RetailObj.enterSWIFTCodeField(information.get(0).get("swiftCode"));
		RetailObj.enterAccountNameField(information.get(0).get("accountName"));
		RetailObj.enterAccountNumberField(information.get(0).get("accountNumber"));
		//RetailObj.clickAgreeRadioButton();
		RetailObj.clickRadioButtonAgree();
		
		logger.info("user entered Register page information");
		Utils.hardWait(1000);
		
		
		
		
		
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		
		RetailObj.clickLoginButton();
		Utils.hardWait(1000);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expectedText ="Success: Your account has been successfully updated.";
		String actualText = RetailObj.getMessageAccountUpdated();
		Assert.assertEquals(expectedText,actualText);
		logger.info("Account has been successfully updated successfuly.");
		Utils.hardWait(1000);
		Utils.takeScreenShot();
	}
	
	// This scenario "@EditAccountInformation"
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		RetailObj.clickEditYourAccountInformation();
		logger.info("Edit your account information’ link click successfuly.");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String,String>> information = dataTable.asMaps(String.class,String.class);
		registerPage.enterFirstName(information.get(0).get("firstname"));
		registerPage.enterLastName(information.get(0).get("lastName"));
		registerPage.enterEmail(information.get(0).get("email"));
		registerPage.enterTelephone(information.get(0).get("telephone"));
		logger.info("User modify below information Entered successfuly .");
		Utils.hardWait(1000);
	}



	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		RetailObj.getMessageAccountUpdated();
		logger.info(RetailObj.getMessageAccountUpdated()+" = ‘Success: Your account has been successfully updated.’");
		Utils.hardWait(1000);
		Utils.takeScreenShot();
	}
	
	
	
	
}
