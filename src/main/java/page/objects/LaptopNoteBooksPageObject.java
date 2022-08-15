package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNoteBooksTabButton;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsAndNotebooksButton;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookItem;

	@FindBy(id = "button-cart")
	private WebElement ItemTextInfo;

	@FindBy(xpath = "(//a[text()='MacBook'])[3]")
	private WebElement MacSuccessMessage;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement InfoTextShoppingCard;

	@FindBy(xpath = "(//button[@data-toggle='dropdown'])[2]")
	private WebElement ShoppingCard;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement ItemRemoveButton;

	@FindBy(id = "cart-total")
	private WebElement ItemTextInfoAfterRemove;

	// --------------------- @ProductComparison -------------------------

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksTopLink;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement comparisonIconMacBook;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement comparisonIconMacBookAir;

	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement successComparisonMessageMacBookAir;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement linkProductComparison;
	
	@FindBy(tagName = "img")
	private List<WebElement> items1;

	public void clickLaptopsAndNoteBooksTabButton() {
		LaptopsAndNoteBooksTabButton.click();
	}

	public void clickShowAllLaptopsAndNotebooksButton() {
		ShowAllLaptopsAndNotebooksButton.click();
	}

	public void clickMacBookItem() {
		MacBookItem.click();

		
	}


	
	
	// --------------------------------@AddingToWishlist
	
	@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
	private WebElement addSonyVaIOtoWishList;
	
	@FindBy(xpath="(//a[text()='Sony VAIO'])[1]")
	private WebElement MessageSonyVAIO;
	
	

	public String AddItemCardMessage() {
		String actualResult = "Success: You have added " + MacSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}

	public String InfoTextShoppingCard() {
		String actualResult = InfoTextShoppingCard.getText();
		return actualResult;
	}

	public void clickItemRemoveButton() {
		ItemRemoveButton.click();
	}

	public String getItemTextInfoAfterRemove() {
		String actualResult = ItemTextInfoAfterRemove.getText();

		return actualResult;
	}

	public void clickShoppingCard() {
		ShoppingCard.click();

	}
	// --------------------- @ProductComparison -------------------------

	public void clickLaptopsAndNotebooksTopLink() {
		LaptopsAndNotebooksTopLink.click();
	}

	public void clickComparisonIconMacBook() {
		comparisonIconMacBook.click();
	}

	public void clickComparisonIconMacBookAir() {
		comparisonIconMacBookAir.click();
	}

	public String ComparisonMessageMacBookAir() {
		String actualResult = "Success: You have added " + successComparisonMessageMacBookAir.getText()
				+ " to your product comparison!";
		return actualResult;
	}

	public void clicklinkProductComparison() {
		linkProductComparison.click();
	}

	public List<WebElement> ListProductComparsonChart() {
		List<WebElement> itemsdesk = items1;
		return itemsdesk;
	}
	
	// --------------------------------@AddingToWishlist

	public void ClickAddSonyVaIOtoWishList() {
		addSonyVaIOtoWishList.click();
	}
	
	public String getMessageSonyVAIO() {
		String actualResult = "You must login or create an account to save " + MessageSonyVAIO.getText()
		+ " to your wish list!";
return actualResult;
		
	}

	//--------------------------@ValidateThePrice---------------------

	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement MakbookProItem;
	
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement MakbookProPrice;

	
	public void clickMakbookProItem() {
		MakbookProItem.click();
	}
	public String getTextMakbookProPrice() {
		String actualResult = MakbookProPrice.getText();
		return actualResult;
	}
	
	
}
