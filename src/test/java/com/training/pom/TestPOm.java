package com.training.pom;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class TestPOm {
	private WebDriver driver;
	
	public TestPOm(WebDriver driver) {

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

	@FindBy(id="memberUsername")
	private WebElement membername;
	
	public void sendMemberName(String membername) {
		this.membername.clear();
		this.membername.sendKeys(membername);
	}
	

	@FindBy(xpath="//li[@id='menu8']/span[@class='menuText']")
	private WebElement menuText;
	
	public void clickMenuText() {
		this.menuText.click(); 
	}

	@FindBy(xpath="//li[@id='submenu8.0']/span[@class='subMenuText']")
	private WebElement submenuText;

	public void clickSubMenuText() {
		this.submenuText.click(); 
	}
	
	


	@FindBy(id="messageBoxSelect")
	private WebElement statusDropdown;
	
	 public void select_list(String messageBoxSelect){
	     Select status_Dropdown=new Select(statusDropdown);
	     status_Dropdown.selectByVisibleText("Sent items");
	 }
	 
	 
	 @FindBy(id="selectAllButton")
		private WebElement selectAllButton;
	 
	 
	 public void clickselectAllButton() {
			this.selectAllButton.click(); 
		}
	 
	 
	 @FindBy(name="messageId")
		private WebElement messageId;
	 
	 public void BooleanmessageId() {
		boolean a=messageId.isSelected();
		Assert.assertTrue(a);
		 System.out.println("Checked");
			
		}
	 
	 
	 
	 
	 @FindBy(id="applyActionSelect")
		private WebElement statusDropdown1;
		
		 public void select_list1(String applyActionSelect){
		     Select status_Dropdown1=new Select(statusDropdown1);
		     status_Dropdown1.selectByValue("MOVE_TO_TRASH");
		 }

		@FindBy(xpath="//*[contains(text(),'Search results')]")
		private WebElement searchresults;
		
		@FindBy(xpath="//*[contains(text(),'Results')]")
		private WebElement results;
		
		public void AssertionHandler()
		{
			String expected=searchresults.getText();
			String actual=this.results.getText();
			Assert.assertEquals(expected, actual);
			System.out.println("Tested");
		}
		 
			
			}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 



