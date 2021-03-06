package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SatyaRegisterPOM {
	private WebDriver driver; 
	
	public SatyaRegisterPOM(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@onclick='publicRegisterUser()']")
	private WebElement SubmitBtn;

	public void Submit() {
		this.SubmitBtn.click();
		}
	
	@FindBy(name="member(user).username")
	private WebElement loginName;

	public void loginName(String loginname) {
		this.loginName.clear();
		this.loginName.sendKeys(loginname);
		}
	
	@FindBy(name="member(name)")
	private WebElement fullName;

	public void fullName(String fullname) {
		this.fullName.clear();
		this.fullName.sendKeys(fullname);
		}
	
	@FindBy(name="member(email)")
	private WebElement email;

	public void Email(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		}
	
	@FindBy(name="member(customValues).value")
	private WebElement calendar;

	public void date(String calendar) {
		
		this.calendar.sendKeys(calendar);
		}
	
	@FindBy(id="_radio_2_1")
	private WebElement Male;
	
	@FindBy(id="_radio_2_0")
	private WebElement FeMale;

	public void Gender(String gender) {
		if(gender=="Male"){
		this.Male.click();
		}else{
			this.FeMale.click();
		}
	}
	@FindBy(xpath="//input[@fieldname='address']")
	private WebElement address;

	public void Address(String address) {
		
		this.address.clear();
		this.address.sendKeys(address);
		}
	
	public void alt(){
		Alert alt=driver.switchTo().alert();
		String a=alt.getText();
		System.out.println(a);
	}
	
	
	@FindBy(xpath="//input[@fieldname='postalCode']")
	private WebElement postalcode;

	public void PostalCode(String postalcode) {
		
		this.postalcode.clear();
		this.postalcode.sendKeys(postalcode);
		}
	
	@FindBy(xpath="//input[@fieldname='city']")
	private WebElement city;
	
	
	public void city(String city) {
		
		this.city.clear();
		this.city.sendKeys(city);
		
	}
	@FindBy(xpath="//input[@fieldname='phone']")
	private WebElement phone;
	
	public void phone(String phone) {
		
		this.phone.clear();
		this.phone.sendKeys(phone);
	
	}
	
	@FindBy(xpath="//input[@fieldname='mobilePhone']")
	private WebElement mblphone;
	
	public void mblphone(String mblphone) {
		
		this.mblphone.clear();
		this.mblphone.sendKeys(mblphone);
		
		
	}
	@FindBy(name="member(customValues).value")
	private WebElement fax;
	
	public void fax(String fax) {
		this.fax.clear();
		this.fax.sendKeys(fax);
		
		
	}
	@FindBy(name="member(customValues).value")
	private WebElement url;
	
	public void url(String url) {
		this.url.clear();
		this.url.sendKeys(url);
		
	}
	@FindBy(name="member(user).password")
	private WebElement password;
	
	public void password(String password) {
		this.password.clear();
		this.password.sendKeys(password);
		
	}
	@FindBy(name="confirmPassword")
	private WebElement confirmpassword;
	
	public void confirmpassword(String confirmpassword) {
		this.confirmpassword.clear();
		this.confirmpassword.sendKeys(confirmpassword);
		
	}
	
	@FindBy(id="saveButton")
	private WebElement saveButton;
	
	public void saveButton() {
		this.saveButton.click();
		
	}
	
	
}

