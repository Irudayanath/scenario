package com.LoginTest;
import Utilities.Webdrivershare;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin extends Webdrivershare{
	
@Test	
public void pageload()
{
    getDriver("chrome");
    driver.get("https://www.amazon.co.in");

	String title=driver.getTitle();
	Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
	System.out.print("Page load successfull");
    //System.setProperty("webdriver.chrome.driver","/Users/Roselin/eclipse-workspace/chromedriver 21");
	//driver.get("https://www.zerodha.com");

}
@Test
public void Verifyorders()
{

	WebElement orders;
	orders=driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]"));
	orders.click();
}

public void close()
{
	driver.quit();
}
}
