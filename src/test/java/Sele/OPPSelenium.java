package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPPSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath(""));
		userName.sendKeys("Rohini");
		

	}

}
