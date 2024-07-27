package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout {
	
	checkout page =new checkout();
	
	@Given("user enters {string} and {string} details")
	public void user_enters_and_details(String username, String password) {
	    page.user_enters_and_details(username, password);
	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   page.user_clicks_on_the_login_button();
	}
	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
	    page.user_clicks_on_the_add_to_cart_button();
	}
	@Then("user navigates to the checkout page")
	public void user_navigates_to_the_checkout_page() {
	   page.user_navigates_to_the_checkout_page();
	}
	@Then("user enters the personal details {string}, {string}, and {string}")
	public void user_enters_the_personal_details_and(String firstname, String lastname, String password) {
	   page.user_enters_the_personal_details_and(firstname, lastname, password);
	}
	@Then("User click on continue btn")
	public void user_click_on_continue_btn() {
	   page.user_click_on_continue_btn();
	}
	@Then("validate user navigate to checkout two page")
	public void validate_user_navigate_to_checkout_two_page() {
	  page.validate_user_navigate_to_checkout_two_page();
	}


	
	
	
	
}
