package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdsPOM {
private WebDriver driver; 
	
	public AdsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName;

	public void sendUserName(String userName ) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	} 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	public void sendPassword(String password) {
		this.password.click();
	}
	
	@FindBy(xpath="//input[@value = '1']")
	private WebElement click1;
	
	public void sendClick1(){
		this.click1.click();
	}
	
	@FindBy(xpath="//input[@value = '2']")
	private WebElement click2;
	
	public void sendClick2(){
		this.click2.click();
	}
	
	@FindBy(xpath="//input[@value = '3']")
	private WebElement click3;
	
	public void sendClick3(){
		this.click3.click();
	}
	
	@FindBy(xpath="//input[@value = '4']")
	private WebElement click4;
	
	public void sendClick4(){
		this.click4.click();
	}
	
	@FindBy(xpath="//input[@value = 'Submit' and @type = 'submit']")
	private WebElement loginBtn; 
	
	public void clickSubmit() {
		this.loginBtn.click(); 
	}
	
	@FindBy(id="memberUsername")
	private WebElement Text; 
	
	public void memberLoginTextbx(){
		this.Text.sendKeys("bodagala");		
	}
	
	@FindBy(xpath = "//input[@linkurl='memberAds?memberId=10']")
	private WebElement manageAds;
	
	public void manageAdvertisement(){
		this.manageAds.click();
	}
	
	@FindBy(id="newButton")
	private WebElement insert; 
	
	public void insertAds(){
		this.insert.click();
	}
	
	@FindBy(name="ad(title)")
	private WebElement title; 
	
	public void EnterTitle(){
		this.title.sendKeys("Manipal Festive Season");
	}
	
	@FindBy(name="ad(category)")
	private WebElement we;
	
	public void selectElement(){
		Select sel = new Select(we);
		sel.selectByIndex(1);
	} 
	
	@FindBy(name="ad(price)")
	private WebElement price;
	
	public void addPrice(){
		this.price.sendKeys("1500000");
	}
	
	@FindBy(id="notExpirableCheck")
	private WebElement expiry;
	
	public void noExpiryCheckbox(){
		this.expiry.click();
	}
	
	@FindBy(tagName= "iframe")
	private WebElement frame;
	
	public void frameHandle(){
		this.frame.sendKeys("Enjoy the offer");
	}
	
	@FindBy(id="saveButton")
	private WebElement subButton;
	
	public void clickSubmit11(){
		this.subButton.click();
	}
	
	public void alertHandle(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@FindBy(xpath="//li[@id = 'menu15']//span[@class='menuText']")
	private WebElement logout;
	
	public void adminLogout(){
		this.logout.click();
	}
	public void alertHandle1() {
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	
	//member login
	
		@FindBy(id="cyclosUsername")
		private WebElement userName1; 
		
		public void sendLoginName1(String userName1) {
			this.userName.clear();
			this.userName.sendKeys(userName1);
		}
	
		@FindBy(id="cyclosPassword")
		private WebElement password1;
		
		public void sendPassword1(String password1) {
			this.password.clear(); 
			this.password.sendKeys(password1); 
		}
		
		@FindBy(xpath="//input[@value = 'p']")
		private WebElement click11;
		
		public void sendClick11(){
			this.click11.click();
		}

		@FindBy(xpath="//input[@value = 'e']")
		private WebElement click22;
		
		public void sendClick22(){
			this.click22.click();
		}
		
		@FindBy(xpath="//input[@value = 'a']")
		private WebElement click33;
		
		public void sendClick33(){
			this.click33.click();
		}
		
		@FindBy(xpath="//input[@value = 'c']")
		private WebElement click44;
		
		public void sendClick44(){
			this.click44.click();
		}
		
		@FindBy(xpath="//input[@value = 'e']")
		private WebElement click55;
		
		public void sendClick55(){
			this.click55.click();
		}
	
		@FindBy(xpath="//input[@value = 'Submit' and @type = 'submit']")
		private WebElement loginBtn1; 
		
		public void clickSubmit1() {
			this.loginBtn1.click(); 
		}
		
		@FindBy(xpath = "//li[@id = 'menu1']//span[@class ='menuText']")
		private WebElement personal;
		
		public void personalLink(){
			this.personal.click();
		}
		
		@FindBy(xpath = "//li[@id = 'submenu1.2']//span[@class = 'subMenuText']")
		private WebElement advertise;
		
		public void advertisementsLink(){
			this.advertise.click();
		}
		
		@FindBy(xpath = "//td[@class='tdHeaderTable']")
		private WebElement textVerify;
		
		public void verifyAds(){
			String exp = "My advertisements";
			String act = this.textVerify.getText();
			Assert.assertEquals(exp, act);
			System.out.println("Advertisements Displayed");
		}

		
	
	
	
	
	
}
