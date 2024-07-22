package Sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitelywait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.olibr.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement email=	driver.findElement(By.xpath("//input[@type='email']"));
    email.sendKeys("Test");
   
    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("guru99@1234");
    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    loginbtn.click();
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(password));
    
    
	}
}
