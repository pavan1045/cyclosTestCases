package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagePOM {
	private WebDriver driver; 
	
	public MessagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
/*admin*/	
	
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	
	public void Password1() {
		this.password1.click(); 
		 }
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	
	public void Password2() {
		this.password2.click(); 
		 }
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	
	public void Password3() {
		this.password3.click(); 
		 }
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	public void Password4() {
		this.password4.click(); 
		 }
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="//li[@id='menu8']//span[@class='menuText']")
	private WebElement messagesBtn;
	
	public void messagesBtn() {
		this.messagesBtn.click(); 
	}
	
	@FindBy(xpath="//li[@id='submenu8.0']//span[@class='subMenuText']")
	private WebElement messages1Btn;
	
	public void messages1Btn() {
		this.messages1Btn.click(); 
	}
	
	@FindBy(id="messageBoxSelect")
	private WebElement list;
	
	public void listBox(){
		Select sel = new Select(list);
		sel.selectByVisibleText("Sent items");
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn1;
	
	public void loginBtn1() {
		this.loginBtn1.click(); 
	}
	
	@FindBy(id="memberUsername")
	private WebElement username; 
	
	public void sendusername(String username){
		this.username.sendKeys(username); 
	}
	
	/*@FindBy(id="memberName")
	private WebElement name; 
	
	public void sendname(String name){
		this.name.sendKeys(name); 
	}*/
	
	@FindBy(id="subjectText")
	private WebElement Text;
	
	public void sendText(String Text){
		this.Text.sendKeys(Text); 
	}
	
	@FindBy(xpath="//iframe[@title='Rich text editor, bodyText']")
	private WebElement body;
	
	public void sendbody(String body){
		this.body.sendKeys(body); 
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn2;
	
	 public void loginBtn2() {
			this.loginBtn2.click(); 
				}
	 public void alertHandle(){
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	 
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logoutBtn2;
	
	 public void logoutBtn2() {
	    	this.logoutBtn2.click(); 
	    		}
	 
	 public void alertHandle1(){
			Alert al = driver.switchTo().alert();
			al.accept();
		}
}
	
	
