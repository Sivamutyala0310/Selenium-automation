package com.automation.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalLinks extends LOginDriver  {
  @Test
  public static void linksCount() throws Exception 
  {
		FileInputStream fis=new FileInputStream("C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\Resources\\Data\\expecteddata.properties");
		Properties p=new Properties();
		p.load(fis);
		String nurl=p.getProperty("url");
		driver.get(nurl);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		for(WebElement e:links)
		{
			System.out.println(e.getAttribute("href"));
		}
  }
}
