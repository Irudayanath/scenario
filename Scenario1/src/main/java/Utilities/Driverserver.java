package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverserver {
public WebDriver driver;
public  void getbrowser(String name)
{
	if(name.equals("Chrome"))
		
	{
		System.setProperty("webdriver.chrome.driver","/Users/Roselin/eclipse-workspace/chromedriver 22");
		driver=new ChromeDriver();

	}
	else
		if(name.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
	
}




}
