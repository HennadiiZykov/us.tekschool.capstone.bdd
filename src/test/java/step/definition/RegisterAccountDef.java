package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.HomePageObj;
import page.objects.RegisterPageObject;
import utilites.Utils;

public class RegisterAccountDef extends Base{
	
	RegisterPageObject registerPage = new RegisterPageObject();
	HomePageObj homePage = new HomePageObj();
	

	@When("user click on Register option")
	public void user_click_on_register_option() {
		registerPage.clikRegisterButton();
		Utils.hardWait(2000);
	}

	@When("user fill the register form with below information")
	public void user_fill_the_register_form_with_below_information(DataTable dataTable) {
		
		List<Map<String,String>> information = dataTable.asMaps(String.class,String.class);
		registerPage.enterFirstName(information.get(0).get("firstName"));
		registerPage.enterLastName(information.get(0).get("lastName"));
		registerPage.enterEmail(information.get(0).get("email"));
		registerPage.enterTelephone(information.get(0).get("telephone"));
		registerPage.enterPasswordString(information.get(0).get("password"));
		registerPage.enterConfirmPassword(information.get(0).get("passwordConfirm"));
		registerPage.selectSubscribe(information.get(0).get("subscribe"));
		logger.info("user entered Register page information");
		
	
		
		
	}

	@When("user accept privacyPolicy")
	public void user_accept_privacy_policy() {
		registerPage.clickPrivacyPolicy();
		logger.info("user clicked on Privacy Policy");
		Utils.hardWait(2000);
	}

	@When("user click on Continue Button")
	public void user_click_on_continue_button() {
		registerPage.clickContinueButton();
		logger.info("user clicked on continue button");
		Utils.hardWait(2000);
	}

	
	@Then("user should see a successfull message {string}")
	public void user_should_see_a_successfull_message(String expected) {
		Assert.assertEquals(expected, registerPage.getSuccessMessage());
		logger.info("Account has been created successfully");
		Utils.takeScreenShot();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
}
