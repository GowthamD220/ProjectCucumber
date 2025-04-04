package pages;



import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CheckoutPage {

	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingbtn;
	@FindBy(id = "termsofservice")
	private WebElement termsofservice;
	@FindBy(name = "checkout")
	private WebElement checkoutBtn;
	@FindBy(xpath = "//input[contains(@id,'BillingNewAddress_Company')]")
	private WebElement company;
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country;
	@FindBy(name = "BillingNewAddress.City")
	private WebElement city;
	@FindBy(name = "BillingNewAddress.Address1")
	private WebElement address1;
	@FindBy(name = "BillingNewAddress.Address2")
	private WebElement address2;
	@FindBy(name = "BillingNewAddress.ZipPostalCode")
	private WebElement zipcode;
	@FindBy(name = "BillingNewAddress.PhoneNumber")
	private WebElement phoneno;
	@FindBy(name = "BillingNewAddress_FaxNumber")
	private WebElement faxno;
	@FindBy(xpath = "(//input[contains(@class,'button-1 new-address-next-step-button')])[1]")
	private WebElement continuebtn1;
	@FindBy(name = "PickUpInStore")
	private WebElement pickup;
	@FindBy(xpath = "(//input[contains(@class,'button-1 new-address-next-step-button')])[2]")
	private WebElement continuebtn2;
	@FindBy(xpath = "//input[contains(@class,'button-1 payment-method-next-step-button')]")
	private WebElement continue3;
	@FindBy(xpath = "//input[contains(@class,'button-1 payment-info-next-step-button')]")
	private WebElement continue4;
	@FindBy(xpath = "//input[contains(@class,'button-1 confirm-order-next-step-button')]")
	private WebElement confirm;
	@FindBy(xpath = "//div[@class=\"title\"]")
	private WebElement orderconfirm;
	
	
	public void clickShopping() {
		shoppingbtn.click();
	}
	public void clickTermsofservice() {
		termsofservice.click();
	}
	public void clickCheckout() {
		checkoutBtn.click();
	}
	public void enterCompany(String companyName) {
		company.sendKeys(companyName);
	}
	public String enterCountry(String countryname) {
		Select s=new Select(country);
		s.selectByVisibleText(countryname);
		return s.getFirstSelectedOption().getText();
	}
	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}
	public void enterAddress1(String address1name) {
		address1.sendKeys(address1name);
	}
	public void enterAddress2(String address2name) {
		address2.sendKeys(address2name);
	}
	public void enterZipcode(String zipcodeNo) {
		zipcode.sendKeys(zipcodeNo);
	}
	public void enterPhone(String phoneno1) {
		phoneno.sendKeys(phoneno1);
	}
	public void enterFaxNo(String fax) {
		faxno.sendKeys(fax);
	}
	public void continue1() {
		continuebtn1.click();
	}
	public void clickPick() {
		pickup.click();
	}
	public void contine2() {
		continuebtn2.click();
	}
	public void continue3btn() {
		continue3.click();
	}
	public void continue4btn() {
		continue4.click();
	}
	public void confirmOrder() {
		confirm.click();
	}
	public boolean verifyOrder() {
		return orderconfirm.isDisplayed();
	}
	
	}
    

