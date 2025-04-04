package stepdefinition;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.BaseClassFinder;

import base.BaseClassMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class HooksClass {

		WebDriver driver;
		ConfigReader config=new ConfigReader();
	@Before
	public void launch() {
		if(driver==null) {
			driver=BaseClassMethod.getdriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		String string = config.getProperty("Url");
		driver.get(config.getProperty("Url"));
	}
	@After
	public void close() {
		
	}
	
}
