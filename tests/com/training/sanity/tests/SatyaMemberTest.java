package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SatyaMemberPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SatyaMemberTest {
	private WebDriver driver;
	private String baseUrl;
	
	private SatyaMemberPOM satyaMemberPOM;
	
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	
		satyaMemberPOM = new SatyaMemberPOM(driver); 
		
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest1() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	 satyaMemberPOM.sendUsername("admin");
	 satyaMemberPOM.sendPassword();
	 satyaMemberPOM.PassBtn1();
	 satyaMemberPOM.PassBtn2();
	 satyaMemberPOM.PassBtn3();
	 satyaMemberPOM.PassBtn4();
	 satyaMemberPOM.SubmitBtn();
	 
	 satyaMemberPOM.Messages();
	//Thread.sleep(3000);
	 satyaMemberPOM.subMessages();
	 satyaMemberPOM.selectSent();
	 satyaMemberPOM.Submit();
	 satyaMemberPOM.memberLogin();
	 satyaMemberPOM.Subject();
	 
	 driver.switchTo().parentFrame();
	 satyaMemberPOM.Body();
	 satyaMemberPOM.Submit1();
	 
	 satyaMemberPOM.alertHandle();
	
	}

 
}
