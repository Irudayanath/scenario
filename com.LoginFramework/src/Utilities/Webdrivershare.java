package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivershare {
public WebDriver driver;
	
	public WebDriver getDriver(String driver1)
	{
		if(driver1.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/Roselin/eclipse-workspace/chromedriver 22");
			driver=new ChromeDriver();
		}
		if (driver1.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		return driver;
	}
} 
