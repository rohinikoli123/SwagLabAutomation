package Sele;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windohandals {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String parentID= driver.getWindowHandle();
        System.out.println(parentID);
       WebElement Multi= driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
       Multi.click();
       Set<String>allhandal=driver.getWindowHandles();
     for(String s:allhandal) {
    	 
    	 if(!parentID.equals(s)){
    		 driver.switchTo().window(s);
    		 String title=driver.getTitle();
    		 if(title.contains("AlertsDemo")) {
    			
    		 
    		 WebElement Clickme=driver.findElement(By.xpath("//button[@id='alertBox']"));
    		 Clickme.click();
    	 
     Alert a=driver.switchTo().alert();
   //  String Popuptext=a.getText();
   //  System.out.println(Popuptext);
   //  a.sendKeys("test");
     a.accept();
     break;
	}
	}
}
	}
}
