package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResisterationSteps {
 @ Given ("user luach the site url")
 public void userLuanchSiteUrl() {
	 System.out.println("luanch url");
 }
 @When ("user enter valid email id")
 public void enterValidEmailId() {
	 System.out.println("enter valid email id");
 }
 @And ("user set the password")
 public void userSetPassword() {
	 System.out.println("set the password");
 }
 @And ("user click on resisteration button")
 public void clickonResisterationButton() {
	 System.out.println("click on resisteration button");
 }
 @Then ("validate the resisteration is successfull")
 public void resisterationSuccessfull() {
	 
 }
}
