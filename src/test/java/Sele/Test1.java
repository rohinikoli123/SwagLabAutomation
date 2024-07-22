package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
	WebElement search=	driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
	search.sendKeys("saree");
	}

}
