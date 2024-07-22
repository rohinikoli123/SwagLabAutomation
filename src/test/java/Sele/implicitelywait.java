package Sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitelywait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.olibr.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("rohinikoli30@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("12345789");
        WebElement loginbtn=driver.findElement(By.xpath("//button[@class='theme-btn  btn-style-one']"));
        loginbtn.click();

	}

}
