package Sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeleniumAuto {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/luma-analog-watch.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Qty=driver.findElement(By.xpath("//input[@id='qty']"));
   Qty.sendKeys("3");
 WebElement Addtocart=driver.findElement(By.xpath("//button[@title='Add to Cart']"));
 Addtocart.click();
 driver.navigate().forward();

 WebElement Shoppingcart=driver.findElement(By.xpath("//a[@class='action showcart']"));

 Shoppingcart.click();
 WebElement checkout=driver.findElement(By.xpath("//button[@class='action primary checkout']"));

  checkout.click();


	}
}
