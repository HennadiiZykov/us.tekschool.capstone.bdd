package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPageObject extends Base{

	public RegisterPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//ul//a[text()='Register']")
	private WebElement clikRegisterButton ;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement fitstNameField;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement passwordConfirmField;
	
	@FindBy(xpath="//input[@type='radio' and @value='1' and @name='newsletter']")
	private WebElement subscribeYes;
	
	@FindBy(xpath ="//input[@type='radio' and @value ='0' and @name='newsletter']")
	private WebElement noSubscribe;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='1' and @name='agree']")
	private WebElement agreePrivacyPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement clickContinueButton;
	
	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;
	
	
	
	public void clikRegisterButton() {
		clikRegisterButton.click();
	}
	
	public void  enterFirstName (String firstName) {
		lastNameField.clear();
		fitstNameField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
		
	}
	
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
		
	}
	
	public void enterTelephone(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
	}
	
	public void enterPasswordString(String password) {
		passwordField.sendKeys(password);
	}
	
	public void enterConfirmPassword(String passwordConfirm) {
		passwordConfirmField.sendKeys(passwordConfirm);
	}
	
	public void selectSubscribe(String option) {
		if(option.equalsIgnoreCase("yes") && !subscribeYes.isSelected()) {
			subscribeYes.click();
		}else
			noSubscribe.click();
	}
	
	public void clickPrivacyPolicy() {
		agreePrivacyPolicy.click();
	}
	
	public void clickContinueButton() {
		clickContinueButton.click();
	}
	
	public String getSuccessMessage() {
		String actualMessage = successMessage.getText();
		return actualMessage;
	}


	
}
