package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.Susmitha_Test1POM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Susmitha_Test2 {
	private WebDriver driver;
	private String baseUrl;
	private Susmitha_Test1POM Susmitha_Test1POM;
	private static Properties properties;
	private WebDriverWait webDriverWait;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Susmitha_Test1POM = new Susmitha_Test1POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void ValidTest_Step2() throws InterruptedException{
	
		Susmitha_Test1POM.SubmitBtn();
		Susmitha_Test1POM.login("sata1102");
		Susmitha_Test1POM.b("satya1414");
		Susmitha_Test1POM.c("satya124@gmail.com");
		Susmitha_Test1POM.d("26-04-1987");
		Susmitha_Test1POM.Gender();
		Susmitha_Test1POM.Address("Bangalore");
		Susmitha_Test1POM.Postalcode("560054");
		Susmitha_Test1POM.city("Bangalore");
		Susmitha_Test1POM.Phone("1445545410");
		Susmitha_Test1POM.mobilePhone("19231151410");
		Susmitha_Test1POM.fax("987764751");
		Susmitha_Test1POM.url("www.google.com");
		Susmitha_Test1POM.password("satya12345");
		Susmitha_Test1POM.confirmPassword("satya12345");
		
		//WebDriverWait wait = new WebDriverWait((WebDriver) Test1POM,30);
		
		Thread.sleep(20000);

		//Test1POM.waitT();
		

		
		/*Test1POM.waitTime();
		WebDriverWait a= new WebDriverWait(driver, 10);
		Test1POM.waitForVisibilityOfElementLocatedBy(name);*/
		Susmitha_Test1POM.Submit1();
		
		Susmitha_Test1POM.ok();
		Susmitha_Test1POM.sendUserName("admin");
		Susmitha_Test1POM.PassBtn();
		Susmitha_Test1POM.PassBtn2();
		Susmitha_Test1POM.PassBtn3();
		Susmitha_Test1POM.PassBtn4();
		Susmitha_Test1POM.clickLoginBtn();
		
		
		
		
		Susmitha_Test1POM.sendMemberName("sushmitha");
		Susmitha_Test1POM.gloan();
		Susmitha_Test1POM.loan("100000");
	
		Susmitha_Test1POM.descriptionBox("home loan");
		Susmitha_Test1POM.Submit11();
		Susmitha_Test1POM.Submit2();
		
		String expected ="The loan was successfully granted";
		
		String actual=Susmitha_Test1POM.actual();
		Assert.assertEquals(expected, actual);
		System.out.println("Message is displayed");
		
		
		
		Susmitha_Test1POM.alertHandle();
		//Test1POM.alertHandle2();
		
		
		
		
		
		
		
		
		
	}
	
}
