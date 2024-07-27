package envTestScenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	Properties prop;
	public static void main(String[] args) throws IOException {
		ReadData d=new ReadData();
		d.ReadconfidData();
		d.userLogin();
		
		
		
	}
		
		public void ReadconfidData() throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"src\\test\\java\\envTestScenario\\Properti.config");
	     prop=new Properties();
		prop.load(file);
				
		
		
	}
               public void userLogin() {
            	   System.out.println("username");
            	   System.out.println("password");
            	   System.out.println("browser");
               }
}
