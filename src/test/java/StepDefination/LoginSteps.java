package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {


		@Given("user luanch site url")
		
		public void userLuanchSiteUrl() {
			System.out.println("user site");
		}
			
		@When("user enter the username and password")
		public void entertheUsernameAndPassword() {
			System.out.println("username and password");
		}
	@And("click on login button")
	public void clicktoLoginButton() {
		System.out.println("click on login button");
	}
		@Then("validate user login successfully")
		public void userLoginSuccessfully() {
			System.out.println("user is login successfully");
		}
	
	
	}

	


