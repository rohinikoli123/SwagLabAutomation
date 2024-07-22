package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	WebElement Dropdown=	driver.findElement(By.xpath("//select[@id='course']"));
      Select s=new Select(Dropdown);
     // s.selectByValue("java");
     // s.selectByIndex(3);
      s.selectByVisibleText("Javascript");
	}

}
