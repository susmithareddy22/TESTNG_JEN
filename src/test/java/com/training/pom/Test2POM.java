package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test2POM {
private WebDriver driver;
	
	public Test2POM(WebDriver driver) {

		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName; 

	@FindBy(id="cyclosPassword")
	public WebElement password1;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String xpath) {
		this.password1.clear(); 
		this.password1.sendKeys(xpath); 
	}
	
	public void PassBtn2() {
		this.PassBtn2.click(); 
	}
	
	public void PassBtn() {
		this.PassBtn.click(); 
	}
	public void PassBtn3() {
		this.PassBtn3.click(); 
	}
	public void PassBtn4() {
		this.PassBtn4.click(); 
	}
	

	@FindBy(xpath="//*[@id='virtualKeyboard']//div[2]//table//tbody//tr//td//input[@value='Submit']")
	private WebElement loginBtn;
	
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement PassBtn;
	@FindBy(xpath="//input[@value='2']")
	private WebElement PassBtn2;
	@FindBy(xpath="//input[@value='3']")
	private WebElement PassBtn3;
	@FindBy(xpath="//input[@value='4']")
	private WebElement PassBtn4;
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	/*@FindBy(id="memberUsername")
	private WebElement membername;
	
	public void sendMemberName(String membername) {
		this.membername.clear();
		this.membername.sendKeys(membername);
	}*/
	

	@FindBy(xpath="//li[@id='menu8']//span[@class='menuText']")
	private WebElement menuText;
	
	public void clickMenuText() {
		this.menuText.click();
		//this.menuText.click();
	}

	@FindBy(xpath="//li[@id='submenu8.0']//span[@class='subMenuText']")
	private WebElement submenuText;

	public void clickSubMenuText() {
		
		//this.submenuText.click();
		this.submenuText.click();
		
	
	}
	
	
	@FindBy(id="messageBoxSelect")
	private WebElement statusDropdown;
	
	 public void select_list(String messageBoxSelect){
	     Select status_Dropdown=new Select(statusDropdown);
	     status_Dropdown.selectByVisibleText("Sent items");
	 }
	 
	 @FindBy(id="newButton")
		private WebElement Submit1;
		
		public void Submit1() {
			this.Submit1.click();
			
		}
		
		
		
		/*@FindBy(xpath="//*[contains(text(),'Search results')]")
		private WebElement alertPrompts;
		
		public void alertPrompt(){
			
			String expected="Search results";
			String actual =(alertPrompts).getText();
			Assert.assertEquals(expected,actual);
			System.out.println("passed");
		}*/
	 
	  @FindBy(id="memberUsername")
		private WebElement memberUsername;
		
		public void memberUsername(String memberUsername) {
			this.memberUsername.clear();
			this.memberUsername.sendKeys(memberUsername);
		}
		
		@FindBy(id="memberName")
		private WebElement memberName;
		
		public void memberName(String memberName) {
			this.memberName.clear();
			this.memberName.sendKeys(memberName);
		}
		
		@FindBy(id="subjectText")
		private WebElement subjectText;
		
		public void subjectText(String subjectText) {
			this.subjectText.clear();
			this.subjectText.sendKeys(subjectText);
		}
		
		
		
		@FindBy(tagName="iframe")
		private WebElement body;
		
		public void body(String body) {
			
			this.body.sendKeys(body);
		}
	    
		@FindBy(xpath="//input[@value='Submit']")
		private WebElement Submit;
		
		public void Submit() {
			this.Submit.click();
			
		}
	 
	 
		public void alt(){
			Alert j=driver.switchTo().alert();
			j.accept();
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}