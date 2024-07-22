package Sele;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement button=driver.findElement(By.xpath("//button[@id='promtButton']"));
	button.click();
	Alert a=driver.switchTo().alert();
	String PopupText=a.getText();
	a.accept();
	a.sendKeys("test");
	}

}
