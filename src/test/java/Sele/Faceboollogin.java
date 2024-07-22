package Sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Faceboollogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		
         email.sendKeys("veemakoli120@gmail.com");
         WebElement name=driver.findElement(By.xpath("//input[@name='fullName']"));
         
 		
       name.sendKeys("veema");
       WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
      username.sendKeys("veema@123");
      
       WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
       pass.sendKeys("1234");
       
       
         
	}

}
