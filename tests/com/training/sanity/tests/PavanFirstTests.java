package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.PavanFirstPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PavanFirstTests {

	private WebDriver driver;
	private String baseUrl;
	private PavanFirstPOM loginPOM;
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
		loginPOM = new PavanFirstPOM(driver); 
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
	public void validLoginTest() {
		loginPOM.sendLoginName("admin");
		//loginPOM.sendPassword("1234");
		loginPOM.sendClick1();
		loginPOM.sendClick2();
		loginPOM.sendClick3();
		loginPOM.sendClick4();
		loginPOM.clickSubmit(); 
		//screenShot.captureScreenShot("First");
		loginPOM.Accounts();
		loginPOM.ManageLone();
		loginPOM.memberLogin();
		loginPOM.clickSubmit1();
		loginPOM.viewDetails();
		loginPOM.verifyByAssert();
		
	}
	

}
