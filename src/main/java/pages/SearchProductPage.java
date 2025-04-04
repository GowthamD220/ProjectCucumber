package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {

	WebDriver driver;
	public SearchProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement search;
	@FindBy(xpath = "//input[contains(@class,'button-1 search-box-button')]")
	private WebElement searchbtn;
	@FindBy(linkText = "Build your own cheap computer")
	private WebElement addtocart;
	@FindBy(xpath = "//input[contains(@id,'add-to-cart-button-72')]")
	private WebElement addToCartBtn;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement verifyaddTocart;
	
	public void enterProduct(String product) {
		search.sendKeys(product);
	}
	public void clickSearch() {
		searchbtn.click();
	}
	public void enterAddtoCart() {
		addtocart.click();
	}
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	public String verifyCart() {
		return verifyaddTocart.getText();
	}
	public String verifySearch() {
		return addtocart.getText();
	}
}
