

package Resources1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public WebDriver driver;
	public WebDriver driverInitialization() throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\testNGframewoek\\src\\main\\java\\Resources1\\Data.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("Browser");
		if(browserName.contentEquals("Chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chrome driver\\chromedriver.exe");
		    @SuppressWarnings("unused")
			ChromeDriver driver = new ChromeDriver();}
		else if (browserName.contentEquals("Firebox")) {
			
		}
		else if (browserName.contentEquals("Edge")){
			System.out.println("please provide bowser value");
	
		}
		
		return driver;
		
	}
}
