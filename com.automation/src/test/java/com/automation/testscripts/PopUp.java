package com.automation.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class PopUp extends LOginDriver {
	
	@Test
 public void launchingHomePage() throws Exception 
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\Resources\\Data\\Popup.properties");
		Properties p=new Properties();
		p.load(fis);
		String nurl=p.getProperty("url");
		driver.get(nurl);
  }
@Test(priority=3)
  public void searchByBus()
  {
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();;
  }
@Test(priority=5)
public void acceptingAlert()
{
	
}
@Test(priority=8)
public void selectingCheckBox()
{
	Alert a=driver.switchTo().alert();
	System.out.println("the alert value is:"+a.getText());
	a.accept();
	driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox pt-2']")).click();
}@Test(priority=10)
public void selectingDropdown()
{
	//driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
	//Select s=new Select();
	//s.selectByValue("30");
	}
}
