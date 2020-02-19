package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PavanFirstPOM {
	private WebDriver driver; 
	
	public PavanFirstPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@value = '1']")
	private WebElement click1;

	@FindBy(xpath="//input[@value = '2']")
	private WebElement click2;
	
	@FindBy(xpath="//input[@value = '3']")
	private WebElement click3;
	
	@FindBy(xpath="//input[@value = '4']")
	private WebElement click4;
	
	@FindBy(xpath="//input[@value = 'Submit' and @type = 'submit']")
	private WebElement loginBtn; 
	
	
	public void sendLoginName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void sendClick1(){
		this.click1.click();
	}
	
	public void sendClick2(){
		this.click2.click();
	}
	
	public void sendClick3(){
		this.click3.click();
	}
	
	public void sendClick4(){
		this.click4.click();
	}
	
	public void clickSubmit() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="//li[@id = 'menu3']//span[@class = 'menuText']")
	private WebElement account;
	
	public void Accounts(){
		this.account.click();
	}
	
	@FindBy(xpath="//li[@id ='submenu3.9']//span[@class = 'subMenuText']")
	private WebElement mLone;
	
	public void ManageLone(){
		this.mLone.click();
	}
	
	@FindBy(id="memberUsername")
	private WebElement name;
	
	public void memberLogin(){
		this.name.sendKeys("manzoor");
	}
	
	@FindBy(xpath="//input[@value = 'Search']")
	private WebElement submitClick;
	
	public void clickSubmit1(){
		this.submitClick.click();
	}
	
	@FindBy(xpath="//img[@loanid = '3']")
	private WebElement view;
	
	public void viewDetails(){
		this.view.click();
	}
	
	@FindBy(xpath="//*[(contains(text(),'Loan details'))]")
	private WebElement validPage;
	
	public String verifyByAssert(){
		
		String act = validPage.getText();
		return act;
	}
}