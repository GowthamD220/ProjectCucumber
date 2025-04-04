package stepdefinition;

import org.testng.Assert;

import base.BaseClassMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SearchProductPage;

public class SearchProductStepdefinition extends BaseClassMethod{

	SearchProductPage search;
	
	@Given("User should enter the product name {string} into search field")
	public void user_should_enter_the_product_name_into_search_field(String string) {

		search=new SearchProductPage(driver);
		search.enterProduct(string);
	}

	@And("User should click the search button")
	public void user_should_click_the_search_button() {
	  search.clickSearch();
	}

	@Then("User shouldd verify that he found the relevent product")
	public void user_shouldd_verify_that_he_found_the_relevent_product() {
	   Assert.assertEquals(search.verifySearch(), "Build your own cheap computer");
	}

	@And("User should click the product")
	public void user_should_click_the_product() {
	   search.enterAddtoCart();
	}

	@And("User should click the add to cart button")
	public void user_should_click_the_add_to_cart_button() {
	  search.clickAddToCart();
	}

	@Then("User should verify product is added to the cart")
	public void user_should_verify_product_is_added_to_the_cart() {
	   Assert.assertEquals(search.verifyCart(), "Shopping cart");
	}

	
}
