package page.objects;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import utilites.Utils;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	// syntax for strong UI Element in POM class using PageFactory implementation
	// @Findby(locatorType="locator")
	// AccessModifier WebElement NameOfElement

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items; // driver.FindElements

	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement HpLp3065;
	
	@FindBy(id="input-quantity")
	private WebElement quantityInpute;
	
	@FindBy(id="button-cart")
	private WebElement addToCardButton;
	
	@FindBy(xpath="(//a[text()='HP LP3065'])[3]")
			private WebElement HPLPsuccessMessage;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DCamera;
	
	@FindBy(id="input-option226")
	private WebElement SelectColorDropDownMenu;
	
	@FindBy(xpath="//select[@id='input-option226']//option[2]")
	private WebElement SelectCollorItem;
	
	@FindBy(xpath="(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement CanonSuccessMessage;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement WriteReviewLink;
	
	@FindBy(id="input-review")
	private WebElement YourReviewField;
	
	@FindBy(id="input-name")
	private WebElement YourNameField;
	
	@FindBy(id="button-review")
	private WebElement reviewContinuButton;
	
	@FindBy(xpath="//input[@type='radio']")
	private List <WebElement> rating; 
	
	@FindBy(xpath="//i[@class='fa fa-check-circle']")
	private WebElement revieSubmissionMessage;
	
	
	
	public void clickonDesktopsTab() {
		Utils.moveToElement(desktopTab);

	}

	public void clickOnShowAllDesktop() {
		showAllDesktops.click();
	}

	public List<WebElement> desktopItems() {
		List<WebElement> itemsdesk = items;
		return itemsdesk;
	}

	public void clickOnHpLp3065() {
		HpLp3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInpute.clear();
		quantityInpute.sendKeys(quantityValue);
		
	}
	
	public void clickOnAddToCardButton() {
		addToCardButton.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added "+ HPLPsuccessMessage.getText() +" to your shopping cart!";
		return 	actualResult;
	
		}
	
	public void clickCanonEOS5DCamera() {
		CanonEOS5DCamera.click();
	}
	
	public void clikcSelectColorDropDownMenu() {
		SelectColorDropDownMenu.click();
	}
	
	public void clickSelectCollorItem() {
		SelectCollorItem.click();
	}
	
	public String CanonSuccessMessage() {
		String actualResult = "Success: You have added "+ CanonSuccessMessage.getText() +" to your shopping cart!";
		return actualResult;
	}
	
	public void clickWriteReviewLink() {
		WriteReviewLink.click();
	}
	
	public void WriteReviewField(String yourReview) {
	YourReviewField.clear();
	YourReviewField.sendKeys(yourReview);
	}
	
	public void WriteYourNameField(String yourName){
		YourNameField.clear();
		YourNameField.sendKeys(yourName);
	}
	
	public void clickReviewContinuButton() {
		reviewContinuButton.click();
	}
	
	public void selectRating(String ratingValue){
		List<WebElement> ratingElements = rating;
		for (WebElement element :ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void ReviewSuccessMessage() {
		
		Boolean message = revieSubmissionMessage.isDisplayed();
		
		if(message == true) {
			System.out.println("+++++++++++++User should see a message");
		}else {
			System.out.println("-------------User dont see a message");
		}
	}
	
}
