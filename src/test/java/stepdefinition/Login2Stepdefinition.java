package stepdefinition;

import org.testng.Assert;

import base.BaseClassMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login2Page;

public class Login2Stepdefinition extends BaseClassMethod {

	Login2Page login;
	
	@Given("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
		login=new Login2Page(driver);
	    login.clickLogin();
	}

	@When("User should enter valid {string} email into email field")
	public void user_should_enter_valid_email_into_email_field(String string) {
	   login=new Login2Page(driver);
	   login.enterEmail(string);
	}

	@When("User should enter valid {string} password into password field")
	public void user_should_enter_valid_password_into_password_field(String string) {
	   login=new Login2Page(driver);
	   login.enterPasswors(string);
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
	   login.clickLoginbtn();
	}

	@Then("User should verify successfully logged in")
	public void user_should_verify_successfully_logged_in() {
	   Assert.assertEquals(login.verifyLoginSuccess(), "gowthamd220@gmail.com");
	}

	
	
}
