package Sele;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjwydSzBhBOEiwAj0XN4Ic21m06lhfD3YiRmOry1SCztae2muF1OyAUC4tFMaWO3Dx8tVjG_hoC0yYQAvD_BwE");
	driver.manage().window().maximize();
	WebElement test=driver.findElement(By.xpath("//ul[@id='nav1']/li[4]/a"));
	Actions a=new Actions(driver);
	a.moveToElement(test).build().perform();
  
	
	

	}

}
