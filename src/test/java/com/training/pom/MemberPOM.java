

package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MemberPOM {

private WebDriver driver; 
	
	public MemberPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="cyclosUsername")
	private WebElement username;
	
	public void sendUsername(String username){
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	public void sendPassword(){
		this.password.click(); 
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement Button1;
	
	public void PassBtn1(){
		this.Button1.click(); 
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement Button2;
	
	public void PassBtn2(){
		this.Button2.click(); 
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement Button3;
	
	public void PassBtn3(){
		this.Button3.click(); 
	}
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement Button4;
	
	public void PassBtn4(){
		this.Button4.click(); 
	}
	@FindBy(xpath="//*[@id='virtualKeyboard']//div[2]//table//tbody//tr[2]/td/input[3]")
	private WebElement SubmitBtn;
	
	public void SubmitBtn(){
		this.SubmitBtn.click(); 
	}
	@FindBy(xpath="//li[@id='menu8']//span[@class='menuText']")
	private WebElement Messages;
	
	public void Messages(){
		this.Messages.click(); 
	}
	
	@FindBy(xpath="//li[@id='submenu8.0']//span[@class='subMenuText']")
	private WebElement subMessages;
	
	public void subMessages() {
		this.subMessages.click();
				
	}
	
	@FindBy(xpath="//*[@id='messageBoxSelect']//option[2]")
	private WebElement selectSent;

	public void selectSent() {
		
		this.selectSent.click();

	}

	@FindBy(id="newButton")
	private WebElement Submit;

	public void Submit() {
		
		this.Submit.click();
	}
	@FindBy(id="memberUsername")
	private WebElement memberUserName;
	
	public void memberLogin() {
		
		this.memberUserName.sendKeys("manzoor");
	}
	
	@FindBy(name="message(subject)")
	private WebElement subject;
	
	public void Subject() {
		
		this.subject.sendKeys("loan repayment");
		
	}
	@FindBy(tagName="iframe")
	private WebElement body;
	public void Body() {
		
		this.body.sendKeys("loan repayment");
		
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit1;
	
	public void Submit1() {
		this.submit1.click();
		}

	public void alertHandle() {
		Alert alt=driver.switchTo().alert();
		   String alert=alt.getText();
		   System.out.println(alert);
		   alt.accept();
		   
	}
		   @FindBy(xpath="//*[contains(text(),'Search results')]")
			private WebElement result;
		   public void AssertionHandler()
			{
			
			String expected = "Search results";
			  String actual = this.result.getText();
			  Assert.assertEquals(expected, actual);
			  System.out.println("Tested");
			}	  
			
		
	}
	

