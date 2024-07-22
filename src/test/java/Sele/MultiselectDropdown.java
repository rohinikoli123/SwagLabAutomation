package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultiselectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
		button.click();
		List<WebElement>dropdown=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for(WebElement ele:dropdown) {
			String value=ele.getText();
			System.out.println(value);
		
			 if(value.equals("javaScript")) {
			ele.click();
			break;
			 }
			}
    	 
      }
	}



