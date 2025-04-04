package stepdefinition;

import java.util.Map;

import org.testng.Assert;

import com.sun.org.apache.xpath.internal.operations.String;

import base.BaseClassMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class CheckoutStepdefinition extends BaseClassMethod {

	CheckoutPage check;
	
	@Given("User should navigate to Shopping cart page")
	public void user_should_navigate_to_shopping_cart_page() {
		check=new CheckoutPage(driver);
	   check.clickShopping();
	}

	@When("User should click the terms of service")
	public void user_should_click_the_terms_of_service() {
	   check.clickTermsofservice();
	}

	@And("User should click the checkout button")
	public void user_should_click_the_checkout_button() {
	   check.clickCheckout();
	}

	@When("user should enter the below details for checkout")
	public void user_should_enter_the_below_details_for_checkout(io.cucumber.datatable.DataTable dataTable) {
	 Map<java.lang.String, java.lang.String> asMap = dataTable.asMap(java.lang.String.class,java.lang.String.class);
	 check.enterCompany(asMap.get("company"));
	 check.enterCity(asMap.get("city"));
	 check.enterAddress1(asMap.get("address1"));
	 check.enterAddress2(asMap.get("address2"));
	 check.enterZipcode(asMap.get("zipCode"));
	 check.enterPhone(asMap.get("phonenumber"));
	 check.enterFaxNo(asMap.get("faxnumber"));
	}
	@When("User select county {string} from dropdown")
	public void When_User_select_county__from_dropdown(java.lang.String country) {
		check.enterCountry(country);
	}
	@And("User should click the continue button")
	public void user_should_click_the_continue_button() {
	  check.continue1();
	}

	@When("User should click in-store pick up checkbox")
	public void user_should_click_in_store_pick_up_checkbox() {
	   check.clickPick();
	}

	@And("user should click continue button")
	public void user_should_click_continue_button() {
	    check.contine2();
	}

	@When("User should select cash on delivery option")
	public void user_should_select_cash_on_delivery_option() {
	   check=new CheckoutPage(driver);
	}

	@And("click continue button")
	public void click_continue_button() {
	  check.continue3btn();
	}

	@And("check for you will pay by COD and then click continue button")
	public void check_for_you_will_pay_by_cod_and_then_click_continue_button() {
		check.continue4btn();
	}

	@And("User should click the confirm button")
	public void user_should_click_the_confirm_button() {
	   check.confirmOrder();
	}

	@Then("User should verify order has been successfullly processed")
	public void user_should_verify_order_has_been_successfullly_processed() {
	    Assert.assertTrue(check.verifyOrder());
	}
	
}
