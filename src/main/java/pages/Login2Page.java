package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {

	WebDriver driver;
	
	public Login2Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(xpath = "//input[contains(@class,'button-1 login-button')]")
	private WebElement loginbtn;
	@FindBy(className = "account")
	private WebElement verifyLogin;
	
	public void clickLogin() {
		login.click();
	}
	public void enterEmail(String emailfield) {
		email.sendKeys(emailfield);
	}
	public void enterPasswors(String pass) {
		password.sendKeys(pass);
	}
	public void clickLoginbtn() {
		loginbtn.click();
	}
	public String verifyLoginSuccess() {
		return verifyLogin.getText();
	}
	
	
	
	
}
