package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.PavanFirstPOM;
import com.training.pom.RojaTestPOM;
import com.training.utility.Driver;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PavanFirstTests {

	private WebDriver driver;
	private String baseUrl;
	private PavanFirstPOM pavanFirstPOM;
	private static Properties properties;
	//private ScreenShot screenShot;
	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		pavanFirstPOM = new PavanFirstPOM(driver); 
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
	@Test
	public void validLoginTest() {
		pavanFirstPOM.sendLoginName("admin");
		//loginPOM.sendPassword("1234");
		pavanFirstPOM.sendClick1();
		pavanFirstPOM.sendClick2();
		pavanFirstPOM.sendClick3();
		pavanFirstPOM.sendClick4();
		pavanFirstPOM.clickSubmit(); 
		//screenShot.captureScreenShot("First");
		pavanFirstPOM.Accounts();
		pavanFirstPOM.ManageLone();
		pavanFirstPOM.memberLogin();
		pavanFirstPOM.clickSubmit1();
		pavanFirstPOM.viewDetails();
		String act=pavanFirstPOM.verifyByAssert();
		String exp = "Loan details";
		Assert.assertEquals(exp, act);
		System.out.println("Loan Details Displayed");
		
		
	}
	

}
