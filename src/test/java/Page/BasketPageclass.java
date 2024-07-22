package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;
import junit.framework.Assert;

public class BasketPageclass {


	public class BasketPageClass extends Base {
		
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
	
	}
}



