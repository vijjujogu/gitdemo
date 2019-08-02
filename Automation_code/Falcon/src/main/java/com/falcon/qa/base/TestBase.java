package com.falcon.qa.base;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.falcon.qa.util.TestUtil;

public class TestBase {
	
	// declaration of global variables
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/falcon"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayalakshmi.Jogu\\eclipse-workspace\\Falcon\\lib\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Vijayalakshmi.Jogu\\AppData\\Local\\Mozilla Firefox\\firefox.exe");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijayalakshmi.Jogu\\eclipse-workspace\\Falcon\\lib\\IEDriverServer.exe");	
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.xpath("//h4[text()='REST API TEST RESULT']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//a/div/h4[contains(text(),'REST API TEST RESULT')]")).click();
	}
}	
