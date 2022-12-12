package com.testngDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import ExcelDataProvider;


public class HomePage {

	
	public WebDriver driver;
	 @BeforeTest
	    public void setUp() {
	        System.out.println("Start test");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	  
	 @Test(dataProvider ="GoogleDataprovider", dataProviderClass=ExcelDataProvider.class)
	  	public void testGoogleData(String keyWord1, String keyWord2, String Keyword3){
	  	  driver.get("https://www.bing.com");
	       WebElement txtBox = driver.findElement(By.id("sb_form_q"));
	       txtBox.sendKeys(keyWord1," ",keyWord2," "+ Keyword3);
	      Reporter.log("Keyword entered is : " +keyWord1+ " " +keyWord2);
	      txtBox.sendKeys(Keys.ENTER);
	      Reporter.log("Search results are displayed.");
	  	}
	 

}
