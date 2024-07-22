package Sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormResisteration {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userName= driver.findElement(By.xpath("//input[@id='firstName']"));
		userName.sendKeys("Rohini");
		WebElement lastName= driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("koli");
		WebElement Email= driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("Rohini@gmail.com");
		WebElement Radio= driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		Radio.click();
		WebElement userNumber= driver.findElement(By.xpath("//input[@id='userNumber']"));
		userNumber.sendKeys("9834211372");
		WebElement DOB= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		DOB.sendKeys("03/05/1995");
		WebElement SUB= driver.findElement(By.xpath("//div[@id='subjectsWrapper']"));
		SUB.sendKeys("rytrytry");
		WebElement UPLOAD= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		UPLOAD.sendKeys("werewr@rtret");
		WebElement address= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("ertretertretrterert");
		 List<WebElement>allDropDown=driver.findElements(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
		 for(WebElement s:allDropDown) {
			 String value=s.getText();
			 if(value.equals("Rajsthan"));
		 }
		
	}

}
