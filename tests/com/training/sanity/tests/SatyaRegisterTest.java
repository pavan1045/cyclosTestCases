package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;

import com.training.pom.SatyaRegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SatyaRegisterTest {
	private WebDriver driver;
	private String baseUrl;
	
	private SatyaRegisterPOM satyaRegisterPOM;
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
		satyaRegisterPOM = new SatyaRegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}

  @Test(dataProvider="cyclos", dataProviderClass=LoginDataProviders.class)
  public void RegisterValidateTest(String Login_name ,String Full_name , String E_Mail,String Gender, String Address,String Postal_Code,String City,String Phone,String Mobile_phone,String Password,String Confirm_password) throws InterruptedException 
 {
	  
	  satyaRegisterPOM.Submit();
	  satyaRegisterPOM.loginName(Login_name);
	  satyaRegisterPOM.fullName(Full_name);
	  satyaRegisterPOM.Email(E_Mail);
	  //registerPOM.date("17/08/1998");
	//  Thread.sleep(9000);
	 // registerPOM.Gender(Gender);
	  satyaRegisterPOM.Address(Address);
	  satyaRegisterPOM.PostalCode(Postal_Code);
	  satyaRegisterPOM.city(City);
	  //registerPOM.Area("");
	  satyaRegisterPOM.phone(Phone);
	  satyaRegisterPOM.mblphone(Mobile_phone);
	 // registerPOM.fax(fax);
	  //registerPOM.url(url);
	  satyaRegisterPOM.password(Password);
	  satyaRegisterPOM.confirmpassword(Confirm_password);
	  Thread.sleep(20000);
	  satyaRegisterPOM.saveButton();
	  satyaRegisterPOM.alt();
	  
	  
  }
}
