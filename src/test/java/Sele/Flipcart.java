package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
   WebElement serachbtn=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
   serachbtn.sendKeys("toys for kids");
 
   
   WebElement fashion=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
   Actions a= new Actions(driver);
   a.moveToElement(fashion).build().perform();
	}

}
