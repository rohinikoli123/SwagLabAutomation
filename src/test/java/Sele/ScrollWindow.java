package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0)", "");
WebElement userName= driver.findElement(By.xpath("//input[@id='userName']"));
userName.sendKeys("Rohini");
WebElement userEmail= driver.findElement(By.xpath("//input[@id='userEmail']"));
userEmail.sendKeys("Rohini@gmail.com");
WebElement Address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
Address.sendKeys("Kolhapur,Gudmudshingi");
	
	WebElement Padd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	Padd.sendKeys("Rohini");
	WebElement Submit= driver.findElement(By.xpath("//button[@id='submit']"));
	Submit.click();
	}
}
