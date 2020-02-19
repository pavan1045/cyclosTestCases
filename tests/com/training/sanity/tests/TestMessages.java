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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.PavanFirstPOM;
import com.training.pom.MessagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestMessages {

	private WebDriver driver;
	private String baseUrl;
	private PavanFirstPOM loginPOM;
	private MessagePOM msgPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new PavanFirstPOM(driver); 
		msgPOM= new MessagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(dataProvider="db-inputs", dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String Member_Login, String Subject, String Body) throws InterruptedException   {
		loginPOM.sendLoginName("admin");
		loginPOM.sendClick1();
		loginPOM.sendClick2();
		loginPOM.sendClick3();
		loginPOM.sendClick4();
		loginPOM.clickSubmit();
	
		msgPOM.messagesBtn();
		msgPOM.messages1Btn();
		msgPOM.listBox();
		msgPOM.loginBtn1();
		msgPOM.sendusername("bodagala");
		Thread.sleep(3000);
		msgPOM.sendText("Offer update");
		msgPOM.sendbody("hii, Enjoy the offer");
		msgPOM.loginBtn2(); 
		msgPOM.alertHandle();
		msgPOM.logoutBtn2();
		msgPOM.alertHandle1();
		//screenShot.captureScreenShot("First");
		
	}
	
}
