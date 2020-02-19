package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;


import com.training.pom.SatyaLoanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SatyaLoanTest {
	private WebDriver driver;
	private String baseUrl;
	
	private SatyaLoanPOM satyaLoanPOM;
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
		
		satyaLoanPOM = new SatyaLoanPOM(driver); 
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
	public void validLoanTest() throws InterruptedException  {
		
		satyaLoanPOM.sendUsername("satya");
		satyaLoanPOM.sendPassword();
		satyaLoanPOM.PassBtn1();
		satyaLoanPOM.PassBtn2();
		satyaLoanPOM.PassBtn3();
		satyaLoanPOM.PassBtn4();
		satyaLoanPOM.SubmitBtn();
		satyaLoanPOM.Account();
		satyaLoanPOM.Loans(); 
		satyaLoanPOM.View();
		satyaLoanPOM.Amount();
		satyaLoanPOM.Repay();
		satyaLoanPOM.alertHandle();
		satyaLoanPOM.logout();
		satyaLoanPOM.alertHandle1();
		satyaLoanPOM.sendUsername1("admin");
		satyaLoanPOM.PassBtn11();
		satyaLoanPOM.PassBtn22();
		satyaLoanPOM.PassBtn33();
		satyaLoanPOM.PassBtn44();
		satyaLoanPOM.SubmitBtn1();
		satyaLoanPOM.memberLogin1("satya");
		satyaLoanPOM.LoanView();
		satyaLoanPOM.alertHandle1();
		  
	}
}
	

  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
