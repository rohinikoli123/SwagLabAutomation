package StepDefinationswaglab;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefination
{
	
	CheckoutStepDefination step=new CheckoutStepDefination();
	@Given("user enters {string} and {string} details")
	public void user_enters_and_details(String username, String password) {
	  step.user_enters_and_details(username, password);
	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	 step.user_clicks_on_the_login_button();
	}
	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
	  step.user_clicks_on_the_add_to_cart_button();
	}
	@Then("user navigates to the checkout page")
	public void user_navigates_to_the_checkout_page() {
	  step.user_navigates_to_the_checkout_page();
	}
	@Then("user enters the personal details {string}, {string}, and {string}")
	public void user_enters_the_personal_details_and(String firstname, String lastname, String password) {
	   step.user_enters_the_personal_details_and(firstname, lastname, password);
	}
	@Then("User click on continue btn")
	public void user_click_on_continue_btn() {
	  step.user_click_on_continue_btn();
	}
	@Then("user_navigate_to_two_checkoutpage")
	public void user_navigate_to_two_checkoutpage() {
		step.user_navigate_to_two_checkoutpage();
	}
}



