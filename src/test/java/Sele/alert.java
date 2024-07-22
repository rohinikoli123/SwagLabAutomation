package Sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
	    driver.manage().window().maximize();
     // WebElement button= driver.findElement(By.xpath("//button[@id='alertBox']"));
       //button.click();
	   // WebElement button= driver.findElement(By.xpath("//button[@id='confirmBox']"));
	    //   button.click();
	    
	    WebElement button= driver.findElement(By.xpath("//button[@id='promptBox']"));
	    
	     button.click();
	     
       
Alert a=driver.switchTo().alert();
String PopupText=a.getText();
System.out.println(PopupText);
a.sendKeys("rohini");
a.accept();
	}

}
