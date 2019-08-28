package com.automation.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LOginDriver 
{
	 static WebDriver driver;
@Test
public void launchDriver() throws Exception
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	
}
}
