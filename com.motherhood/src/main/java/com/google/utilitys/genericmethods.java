package com.google.utilitys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericmethods {
	public String PropertyReader() throws IOException
	{

		Properties loadfile=new Properties();

		BufferedReader br= new BufferedReader(new FileReader("enviornment.properties"));
		loadfile.load(br);
		String url=loadfile.getProperty("URL");
		return url;
	}
		public void clickOnButton(WebDriver driver,String element) throws InterruptedException 
		{
		Thread.sleep(5000);
			driver.findElement(By.xpath(element)).click();
		}
		public void linkclick(WebDriver driver,String element) throws InterruptedException
			{
			Thread.sleep(5000);
			driver.findElement(By.linkText(element)).click();
		}
		public void sendkeys(WebDriver driver,String element) throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement( By.xpath(element)).sendKeys("Gireesh");

		}

		public void actionmethod(WebDriver driver,WebElement location) throws InterruptedException

		{
			Thread.sleep(5000);
			Actions act = new Actions(driver);
			act.moveToElement(location).click().build().perform();
        }
        public void actionmethodbanloc(WebDriver driver,WebElement bangalore) throws InterruptedException

		{
        	Thread.sleep(5000);
			Actions act1 = new Actions(driver);
			act1.moveToElement(bangalore).click().build().perform();
		}
       public void actionmethodbanash(WebDriver driver,WebElement banashankari) throws InterruptedException

		{
    	   Thread.sleep(5000);
			Actions act2 = new Actions(driver);
			act2.moveToElement(banashankari).click().build().perform();
        }
       public void selectdropdown(WebDriver driver,String element) throws InterruptedException
       {
    	   Thread.sleep(5000);
    	 WebElement options= driver.findElement(By.xpath(element));
    	   selectByVisibleText(options,"Radiology");
       }

		public void selectByVisibleText(WebElement element,String value) throws InterruptedException 
		{
			Thread.sleep(8000);
			Select s = new Select(element);

			List<WebElement> alloptions=s.getOptions();
			for(WebElement option:alloptions)
			{
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
			}

		}

		public void getexperiencemethod(WebDriver driver, String getexperience) throws InterruptedException {
			String xpathv=getexperience;
			String exp=driver.findElement(By.xpath(xpathv)).getText();
			System.out.println(exp);
			Thread.sleep(5000);

		}
		public void getunitmethod(WebDriver driver, String getunit) throws InterruptedException {
			String xpathv=getunit;
			String unit=driver.findElement(By.xpath(xpathv)).getText();
			System.out.println(unit);
			Thread.sleep(5000);

		}
		public void getworkhourmethod(WebDriver driver, String getworkhour) throws InterruptedException {
			String xpathv=getworkhour;
			String wh=driver.findElement(By.xpath(xpathv)).getText();
			System.out.println(wh);
			Thread.sleep(5000);

		}
		public void actionmethod(WebDriver driver, String location) {
			// TODO Auto-generated method stub

		}
		public void actionmethodbanloc(WebDriver driver, String bangalore) {
			// TODO Auto-generated method stub

		}
		public void actionmethodbanash(WebDriver driver, String banashankari) {
			// TODO Auto-generated method stub

		}


     		
     		
     		
     		
     		
     		
     		
     		
      }


