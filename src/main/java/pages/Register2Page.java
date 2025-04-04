package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Register2Page {

	WebDriver driver;
	
	public Register2Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement register;
	@FindBy(id="gender-male")
	private WebElement gender;
	@FindBy(id = "FirstName")
	private WebElement firstName;
	@FindBy(id = "LastName")
	private WebElement lastName;
	@FindBy(id = "Email")
	private WebElement emailField;
	@FindBy(name = "Password")
	private WebElement password;
	@FindBy(name = "ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id = "register-button")
	private WebElement registerbtn;
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement account;
	
	public void registerPage() {
		register.click();
	}
	public void genderbtn() {
		gender.click();
	}
	public void enterFirstName(String username) {
		firstName.sendKeys(username);
	}
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void enterConfirmPassword(String confirmpass) {
		confirmPassword.sendKeys(confirmpass);
	}
	public void clickRegister() {
		registerbtn.click();
	}
	public String verifyRegistration() {
		return account.getText();
	}
}
