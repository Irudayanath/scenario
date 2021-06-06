package com.LoginFramework;
import Utilities.Webdrivershare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.LoginTest.TestLogin;
public class Login extends Webdrivershare
{
	public class Loginc extends TestLogin
	{
	@Test
	public void run()
	{
		
	     pageload();
		 Verifyorders();
	}
	

	}

}
