
	package page.objects;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import core.Base;

	public class HomePageObj extends Base {
		/**
		 * In this class we will store all UI Elements that belongs to Home page of this
		 * application.
		 */

		/**
		 * We will use PageFactory Class to initialize the UI elements we store in this
		 * class. PageFactory class provides a method called .initElements and this
		 * method job is to initialize all UI (User Interface) Elements.
		 */
		public HomePageObj() {
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(xpath ="//span[text()='Currency']")
		private WebElement currencyDropDownButton;

		@FindBy(xpath ="//button[@name='EUR']")
		private WebElement euroButton;
		
		@FindBy(xpath ="//strong[text()='€']")
		private WebElement textCurrenceEuro;
		
		@FindBy(xpath = "//span[@id='cart-total']")
		private WebElement shopingCartButton;
		
		@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
		private WebElement CartMessageAfterClick;
		
		public void clickCurrencyDropDownButton() {
			currencyDropDownButton.click();
		}
		
		public void clickEuroButton() {
			euroButton.click();
		}
		
		public String getTextCurrenceEuro() {
			String EuroText = textCurrenceEuro.getText();
					return EuroText;
		}
		
		public void clickShopingCartButton() {
			shopingCartButton.click();
		}
		
		public String getTextMessageAfterClickOnCart() {
			String messageAfterClikcOnCart = CartMessageAfterClick.getText();
			return messageAfterClikcOnCart;
		}
		
		
	}


