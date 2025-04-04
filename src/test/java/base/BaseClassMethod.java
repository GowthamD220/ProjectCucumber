package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ConfigReader;

public class BaseClassMethod {

	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		ConfigReader config=new ConfigReader();
		String browser = config.getProperty("browser");
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
		driver=new FirefoxDriver();
		break;
		case "edge":
			driver=new EdgeDriver();
		default:
			break;
		}
		return driver;
		
	}
	public static void closeDrivr() {
		if (driver!=null) {
			driver.quit();
		}
	}
}
