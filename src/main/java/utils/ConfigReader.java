package utils;

import java.io.FileInputStream; 
import java.util.Properties;

public class ConfigReader {
	
	private Properties p;
	public ConfigReader() {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\kavit\\eclipse-workspace\\SeleniumTestProgram\\src\\test\\resources\\propertyfile\\config.properties");
		p=new Properties();
		p.load(fis);
		}catch(Throwable s) {
			s.printStackTrace();
		}
		}
		
	public String getProperty(String key) {
		return p.getProperty(key);
	}
	
	
	
}
