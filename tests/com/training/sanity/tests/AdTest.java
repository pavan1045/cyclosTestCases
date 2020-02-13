package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdsPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdTest {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdsPOM advertisement;
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
		loginPOM = new LoginPOM(driver);
		advertisement = new AdsPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		//driver.quit();
	}

  @Test (priority = 0)
  public void AdsvalidationTest() {
	  
	  advertisement.sendUserName("admin");
	  advertisement.sendClick1();
	  advertisement.sendClick2();
	  advertisement.sendClick3();
	  advertisement.sendClick4();
	  advertisement.clickSubmit();
	  advertisement.memberLoginTextbx();
	  advertisement.manageAdvertisement();
	  advertisement.insertAds();
	  advertisement.EnterTitle();
	  advertisement.selectElement();
	  advertisement.addPrice();
	  advertisement.noExpiryCheckbox();
	  advertisement.frameHandle();
	  advertisement.clickSubmit11();
	  advertisement.alertHandle();
	  advertisement.adminLogout();
	  advertisement.alertHandle1();
	 		
  }
  
  @Test (priority = 1)
  public void memberLoginAds(){
	  advertisement.sendLoginName1("bodagala");
	  advertisement.sendClick11();
	  advertisement.sendClick22();
	  advertisement.sendClick33();
	  advertisement.sendClick44();
	  advertisement.sendClick55();
	  advertisement.clickSubmit1();
	  advertisement.personalLink();
	  advertisement.advertisementsLink();
	  advertisement.verifyAds();
  }
}
