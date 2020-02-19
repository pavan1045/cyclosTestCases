package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.Susmitha_Test2POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Susmitha3_Test {
	private WebDriver driver;
	private String baseUrl;
	private Susmitha_Test2POM Susmitha_Test2POM;
	private static Properties properties;
	private WebDriverWait webDriverWait;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Susmitha_Test2POM = new Susmitha_Test2POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void login(){
		Susmitha_Test2POM.sendUserName("admin");
		Susmitha_Test2POM.PassBtn();
		Susmitha_Test2POM.PassBtn2();
		Susmitha_Test2POM.PassBtn3();
		Susmitha_Test2POM.PassBtn4();
		Susmitha_Test2POM.clickLoginBtn();

		Susmitha_Test2POM.clickMenuText();
	}

	@Test(priority=2, dataProvider="subject",dataProviderClass=LoginDataProviders.class)
	public void validStep_3(String Member_Login,String Subject,String Body) throws InterruptedException{



		Susmitha_Test2POM.clickSubMenuText();
		Susmitha_Test2POM.select_list("Sent items");
		Susmitha_Test2POM.Submit();
		Susmitha_Test2POM.memberUsername(Member_Login);
		Susmitha_Test2POM.subjectText(Subject);
		driver.switchTo().parentFrame();
		Susmitha_Test2POM.body(Body);
		Susmitha_Test2POM.Submit();
		Susmitha_Test2POM.alt();


	}

}
