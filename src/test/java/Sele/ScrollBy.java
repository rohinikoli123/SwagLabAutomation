package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		driver.manage().window().maximize();
		WebElement m=driver.findElement(By.xpath("//div[@class='container ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
//js.executeScript(argument[0].scrollinttoView;",WebElement);
		
	}

}
