package TestScenario;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Driverserver;

public class LoginTest  extends Driverserver{
	@Test
	public void logincheck()
	{
		getbrowser("Chrome");
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement signin=driver.findElement(By.xpath("//a[@class=\"login\"]\n"));
		signin.click();
		String title=driver.getTitle();
		AssertJUnit.assertEquals(title,"Login - My Store");
	   System.out.print("loginpageloaded");
	   
	   
	   WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	   email.sendKeys("jetblue@grr.la");
	   
	   WebElement pass=driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
	   pass.sendKeys("jetblue");
	   
	   WebElement Login=driver.findElement(By.xpath("//i[@class=\"icon-lock left\"]"));
	   
	   Login.click();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	   
	   WebElement tshirts=driver.findElement(By.xpath("//li/a[@title=\"T-shirts\"]"));
	   
	   //WebDriverWait wb=new WebDriverWait(driver,20);
	  // wb.until(ExpectedConditions.elementToBeClickable(tshirts));
	   tshirts.click();
	   
	   WebElement addto=driver.findElement(By.xpath("//span[contains(text(),\"Add to cart\")]"));
	   addto.click();
	   WebElement checkoutsuc=driver.findElement (By.xpath("//h2[1]"));
	   
	   String check=checkoutsuc.getText();
	   Assert.assertEquals("Product successfully added to your shopping cart There are 2 items in your cart.",check);
	   
	  System.out.print("Successfull");
	  
	  driver.quit();
	   
	   }
	   
	   
	}
	

