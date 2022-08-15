package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base{

	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement envirementTextFromUI;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement dropDownAccountMenu;
	
	@FindBy(xpath="//ul//a[text()='Login']")
	private WebElement droploginButton;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailAddressField;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//h2[text()= 'My Account']")
	private WebElement myAccaountTextAfterLogin; 
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement EditAffiliateInformation;
	
	@FindBy(xpath="//input[@type='radio' and @value='bank']")
		private WebElement BankTransferRadioBut;
	
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement BankNameField;
	
	@FindBy(xpath="//input[@id='input-bank-branch-number']")
	private WebElement ABANumberField;
	
	@FindBy(xpath="//input[@id='input-bank-swift-code']")
	private WebElement SWIFTCodeField;
	
	@FindBy(xpath="//input[@id='input-bank-account-name']")
	private WebElement AccountNameField;
	
	@FindBy(xpath="//input[@id='input-bank-account-number']")
	private WebElement AccountNumberField;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement AgreeRadioButton;
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement MessageAccountUpdated;
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement EditYourAccountInformation;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement RadioButtonAgree;
	
	
	public void clickRadioButtonAgree() {
		RadioButtonAgree.click();
	}
	
	public String getEnvirementText() {
		String textFromUi = envirementTextFromUI.getText();
		return textFromUi;
	}
	
	
	public void clikOnMyAccountButton() {
		dropDownAccountMenu.click();
	}
	
	public void clickDropLoginButton() {
		droploginButton.click();
	}
	
	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getTextAfterLogin() {
		String myAccountText = myAccaountTextAfterLogin.getText();
				return myAccountText;
	}
	
	
	
	
	public void clikEditYourAffilateInformation() {
		EditAffiliateInformation.click();
	}
	
	public void clickBankTransferRadioBut() {
		BankTransferRadioBut.click();
	}
	
	public void enterBankNameField(String bankName) {
		BankNameField.sendKeys(bankName);
	}
	
	public void enterABANumberField(String abaNumber) {
		ABANumberField.sendKeys(abaNumber);
	}
	
	public void enterSWIFTCodeField(String swiftCode ) {
		SWIFTCodeField.sendKeys(swiftCode);
	}
	
	public void enterAccountNameField(String accountName) {
		AccountNameField.sendKeys(accountName);
	}
	
	public void enterAccountNumberField(String accountNumber) {
		AccountNumberField.sendKeys(accountNumber);
	}
	
	public String getMessageAccountUpdated() {
		String MessageAccountUpdatedText = MessageAccountUpdated.getText();
		return MessageAccountUpdatedText;
	}
	
	public void clickEditYourAccountInformation() {
		EditYourAccountInformation.click();
	}
	
	public void clickAgreeRadioButton() {
		AgreeRadioButton.click();
	}
	
	
	
}
