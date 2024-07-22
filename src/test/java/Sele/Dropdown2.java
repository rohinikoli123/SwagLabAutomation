package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	List<WebElement>dropdown=driver.findElements(By.xpath("//select[@id='ide']"));
	for(WebElement ele:dropdown) {
		ele.equals(dropdown);
	}
	}

}
