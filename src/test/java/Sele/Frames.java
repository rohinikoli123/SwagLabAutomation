package Sele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frm2");
	      WebElement firstName=  driver.findElement(By.xpath("//input[@id='firstName']"));
	      firstName.sendKeys("Rohini");
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frm1");
	    WebElement btn=driver.findElement(By.xpath("//select[@id='course']"));
	
	   Select s=new Select(btn);
	   s.selectByIndex(3);
			   
	  
		       }
		       
	}


