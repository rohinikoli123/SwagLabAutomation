package Page;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;


public class CheckOutPage extends Base {
	public void ClickToAddTocart() {
	WebElement add=driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
	clickonElement(add);
}	
	private void clickonElement(WebElement add) {	
	}
	
	public void validateCartCount(String count) {
		WebElement shoppingCart=driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']"));
		String cartvalue=shoppingCart.getText();
		System.out.println(cartvalue);
	}
	public void user_navigate_to_checkoutpage() {
		
	WebElement cartLink=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
clickonElement(cartLink);

WebElement checkout=driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
		clickonElement(checkout);
	}

	public void user_enters_the_personal_details_and(String firstname, String lastname, String zipcode) {
	  WebElement Firstname= driver.findElement(By.xpath("//input[@id='first-name']"));
	  Firstname.sendKeys("test");
	  
	WebElement Lastname=  driver.findElement(By.xpath("//input[@id='last-name']"));
	Lastname.sendKeys("Automation");
	
	WebElement PostalCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	PostalCode.sendKeys("45654");
	
	
	}
	public void clickonBtn() {
	WebElement LoginBtn=driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
	clickonElement(LoginBtn);
	}
	public void validate_user_navigate_to_checkout_two_page() {
		String url=driver.getCurrentUrl();
Assert.assertTrue(url.contains("step-two"));
	}
	
		
	}

	




	


