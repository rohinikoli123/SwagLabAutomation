package helper;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class Base {
	static public Properties prop;
	static public  WebDriver driver;	
static 
{
	
	FileInputStream file = null;
	try {
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\envTestScenario");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	 prop= new Properties();
      try {
		prop.load(file);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	} 
}
	public void setup() {
	String browserName= prop.getProperty("browser");
	switch(browserName){	
	case "Chrome":
 driver=new ChromeDriver();
		break;
		
	case  "ff":
 driver=new FirefoxDriver();
	
		break;
	}
	 driver= new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }

  public void SelectValueFromDropdwonValue(WebElement ele, int value) {
	
  Select sel= new Select(ele);
    sel.selectByValue("Test");
  }
  
  public void selectBootstrapDropdown(List<WebElement> list, String value) {
	    for (WebElement ele : list) {
	        String text = ele.getText();
	        if (text.equals(value)) {
	            ele.click();
	            break;
	        }
	    }
	 	 
 }
 public void MouseOver(WebElement ele) {
	 handalAlert("accept");
	 Actions a= new Actions(driver);
	 a.moveToElement(ele).build().perform();
 }
  
 private void handalAlert(String string) {	
}

public void Alert(String action) {
Alert a=driver.switchTo().alert();
switch(action) {
case "accept":
	a.accept();
	break;
	
case "dismiss":	
	a.dismiss();
	break;
	
case "sendkeys":
	a.sendKeys("test");
	break;
	
case "getText":
	String value=a.getText();
	break;
}
 
}
public void ExplicitCondition(WebElement ele, long wait) {
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(wait));
	w.until(ExpectedConditions.visibilityOf(ele));	
}	
public void ElementToBeClickable(WebElement ele, long wait) {
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(wait));
	w.until(ExpectedConditions.elementToBeClickable(ele));	
}	
public void ExecuteScript(WebDriverWait ele) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	js.executeScript("arguments[0].click;",ele);
}
public void switchFrame(String value) {
	switch(value) {
	case "name":
	
	driver.switchTo().frame(value);
	break;

	case "index":
		driver.switchTo().frame(Integer.parseInt(value));
		break;
}
}
public void WindowHandal(String title) {
	Set<String>allhandal=driver.getWindowHandles();
	for(String s:allhandal) {
		if(s.equals(title));
	}
	}


}





