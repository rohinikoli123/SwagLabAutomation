package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {

	public static void main(String[] args) {
        int i;
        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();
		WebElement userName =driver.findElement(By.xpath("//input[@id='firstName']"));
		userName.sendKeys("Rohini");

       WebElement lastname=driver.findElement(By.xpath("//input[@name='lName']"));
       lastname.sendKeys("Koli");
       

       WebElement Rbtn=driver.findElement(By.xpath("//input[@id='malerb']"));
       Rbtn.click();
       
       WebElement checkbox=driver.findElement(By.xpath("//input[@id='englishchbx']"));
       
       checkbox.click();
       List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
       int totalcheckbox=allcheckbox.size();
       for(i=0;i<=totalcheckbox;i++) {
    	   if(allcheckbox.get(i).getAttribute("id").equals("hindichbx")||allcheckbox.get(i).getAttribute("id").equals("spanishchbx")||allcheckbox.get(i).getAttribute("id").equals("frenchchbx")) {
    		   
    	  
       WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
       email.sendKeys("test@gmail.com");
       WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
       pass.sendKeys("1234567");

    	   }
       }
	}
}

       
	
