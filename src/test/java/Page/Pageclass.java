package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;
import junit.framework.Assert;

public class Pageclass extends Base {

	private static final WebElement ErrorMessage = null;

	public void user_enter_and(String username, String password) {
WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
userName.sendKeys("");


WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
passWord.sendKeys("");
WebElement Login=driver.findElement(By.xpath("//input[@id='login-button']"));
Login.sendKeys("");
	}
	
	public void Check_Error_mesg() {
		
		WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertTrue(ErrorMessage.isDisplayed());
}

	}


