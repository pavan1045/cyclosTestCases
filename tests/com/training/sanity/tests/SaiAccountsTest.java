package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.SaiAccPOM;
import com.training.pom.SaiAccountsPOM;
import com.training.pom.SaiMemOpPOM;
import com.training.pom.SaiMemberPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SaiAccountsTest { 
	private WebDriver driver;
	private String baseUrl;
	private SaiAccountsPOM AccountsPOM;
	private SaiAccPOM AccPOM;
    private SaiMemberPOM MemberPOM;
    private SaiMemOpPOM MemOpPOM;

	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		AccountsPOM = new SaiAccountsPOM(driver); 
		AccPOM = new SaiAccPOM(driver); 
		MemberPOM = new SaiMemberPOM(driver); 
		MemOpPOM = new SaiMemOpPOM(driver); 



		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(priority=0)
	public void validLoginTest() {
		AccountsPOM.sendUserName("admin");
		AccountsPOM.pwd1();
		AccountsPOM.pwd2();
		AccountsPOM.pwd3();
		AccountsPOM.pwd4();
		AccountsPOM.SubmitBtn(); 
		//screenShot.captureScreenShot("First");
	}
   @Test (priority=1)
     public void op() throws InterruptedException{
	   AccPOM.account();
	   AccPOM.memeber();
	   AccPOM.sendUserName("sai");
	   Thread.sleep(3000);
	   //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);				

	  // AccPOM.sendMemberName("saisri");
	   AccPOM.amount("5000");
       AccPOM.List();
       AccPOM.description("WELCOME");
       AccPOM.submit();
       AccPOM.Submit1();
       AccPOM.logout();
       Alert a=driver.switchTo().alert();
	   a.accept();

   }
   @Test(priority=2)
	public void memberLoginTest() {
		MemberPOM.sendUserName1("saisri");
	     MemberPOM.pwd1();
		MemberPOM.pwd2();
		MemberPOM.pwd3();
		MemberPOM.pwd4();
		MemberPOM.SubmitBtn(); 
		MemOpPOM.account();
		MemOpPOM.accinfo();
		//screenShot.captureScreenShot("First");
	}
  }

