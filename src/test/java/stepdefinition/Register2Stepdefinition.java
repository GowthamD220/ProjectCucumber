package stepdefinition;

import java.util.Map;

import org.testng.Assert;

import base.BaseClassMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register2Page;

public class Register2Stepdefinition extends BaseClassMethod{

	Register2Page register;
	@Given("user should navigate to Registration page")
	public void user_should_navigate_to_registration_page() {
		register=new Register2Page(driver);
		register.registerPage();
	}

	@When("User should enter Personal details in the Mandatory field")
	public void user_should_enter_personal_details_in_the_mandatory_field() {
	   register.genderbtn();
	}

	@When("User should select the gender")
	public void user_should_select_the_gender(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> data = dataTable.asMap(String.class,String.class);
	   register.enterFirstName(data.get("firstName"));
	   register.enterLastName(data.get("lastName"));
	   register.enterEmail(data.get("email"));
	   register.enterPassword(data.get("password"));
	   register.enterConfirmPassword(data.get("confirmPassword"));
	}

	@When("User sould click Register button")
	public void user_sould_click_register_button() {
	   register.clickRegister();
	}

	@Then("User should verify Account is registered")
	public void user_should_verify_account_is_registered() {
	    Assert.assertEquals(register.verifyRegistration(), "Wishlist");
	}
	
}
	