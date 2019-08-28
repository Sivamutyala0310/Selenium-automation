package com.automation.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Redus extends LOginDriver  {
  @Test
  public void f() throws Exception 
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\Resources\\Data\\Popup.properties");
		Properties p=new Properties();
		p.load(fis);
		String nurl=p.getProperty("rurl");
		driver.get(nurl);
  }
		//driver.findElement(By.xpath("//div[@class='btn redBtn flRt'])")).click();;
  		@Test
		public void redAlert()
		{
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("hyderabad");
	Alert a=driver.switchTo().alert();
	System.out.println("the alert value is:"+a.getText());
	a.accept();
		}
  }

