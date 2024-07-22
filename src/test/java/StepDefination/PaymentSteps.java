package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {
	@Given("user select payment option")
	public void userSelectPaymentOption() {
		System.out.println("payment option");
	}
	@When("user enter card details")
	public void user_enter_card_details() {
	   System.out.println("enter card details");
	}

	@And("user enter account number")
	public void user_enter_account_number() {
	   System.out.println("enter account number");
	}

	@And("user enter cvv number")
	public void user_enter_cvv_number() {
	 System.out.println("enter cvv number");
	}

	@And("user enter expiry date")
	public void user_enter_expiry_date() {
	System.out.println("enter expiry date");
	}

	@And("user click on submit button")
	public void user_click_on_submit_button() {
	   System.out.println("click on submitt button");
	}

	@Then("validate the payment is successfull")
	public void validate_the_payment_is_successfull() {
	  System.out.println("payment is successfull");
	}



	

}
