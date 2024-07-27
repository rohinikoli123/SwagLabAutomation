package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabtEST {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        WebElement addtocart= driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
        addtocart.click();
        WebElement wishlist=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
        wishlist.click();
        WebElement checkout=driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        checkout.click();
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("amruta");
        WebElement lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("menan");
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("417454");
        WebElement cont=driver.findElement(By.xpath("//input[@value='CONTINUE']"));
        cont.click();
		
	}
	

}
