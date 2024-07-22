package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketPageClass {
	
	BasketPageClass  page=new BasketPageClass ();
	
	@When("user enter {string} and {string} details")
	public void user_enter_and_details(String username, String password) {
		page.user_enter_and_details(username, password);
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		page.user_click_on_login_button();
	}
  @And("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
  page.user_click_on_add_to_cart_button();
		
	}
  @Then("validate cart count is {string}")
  public void validate_cart_count_is(String string) {
     page.user_validate_cart_count();
  }
	private void user_validate_cart_count() {
	
	
}
	@And ("user navigate to checkout page") 
	public void user_navigate_to_checkoutpage() {
		page.user_navigate_to_checkoutpage();
	}

	@And ("user enter the personal details fisrtname, lastname and zipcode")
	public void  user_enter_the_personaldetails_firstname_lastname_and_zipcode() {
		page.user_enter_the_personaldetails_firstname_lastname_and_zipcode();
		
	}
	
	
}
