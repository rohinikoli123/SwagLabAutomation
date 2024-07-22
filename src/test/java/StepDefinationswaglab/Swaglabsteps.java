package StepDefinationswaglab;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swaglabsteps {
	Swaglabsteps swag= new Swaglabsteps();

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
	   swag.user_enter_and(username, password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("user validate successful login")
	public void user_validate_successful_login() {
	   
	}
	@Then ("user validate the error message")
	public void validate_error_message() {
		swag.validate_error_message();
	}
        	
        }


         
	


