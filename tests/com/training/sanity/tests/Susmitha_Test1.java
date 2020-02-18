package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.Susmitha_TestPOm;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Susmitha_Test1 {
	private WebDriver driver;
	private String baseUrl;
	private Susmitha_TestPOm Susmitha_TestPOm;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Susmitha_TestPOm = new Susmitha_TestPOm(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.quit();
	}
	
	@Test
	public void validTest_Step1() {
		
		Susmitha_TestPOm.sendUserName("admin");
		Susmitha_TestPOm.PassBtn();
		Susmitha_TestPOm.PassBtn2();
		Susmitha_TestPOm.PassBtn3();
		Susmitha_TestPOm.PassBtn4();
		Susmitha_TestPOm.clickLoginBtn();
		
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Susmitha_TestPOm.sendMemberName("sushmitha");
		Susmitha_TestPOm.clickMenuText();
		Susmitha_TestPOm.clickSubMenuText();
		
		Susmitha_TestPOm.select_list("messageBoxSelect");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Susmitha_TestPOm.clickselectAllButton();
		Susmitha_TestPOm.BooleanmessageId();
		Susmitha_TestPOm.select_list1("applyActionSelect");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert j=driver.switchTo().alert();
		j.accept();	
		
	}
	
	
	
	
	
}
