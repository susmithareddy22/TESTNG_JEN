package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoanPOM {
private WebDriver driver; 
	
	public LoanPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//li[@id='menu2']//span[@class='menuText']")
	private WebElement account;
	
	public void Account() throws InterruptedException {
		
		this.account.click(); 
		Thread.sleep(3000);
	}
	
	
	@FindBy(xpath="//*[@id='submenu2.3']//span[2]")
	private WebElement loan;
	
	public void Loans() {
		
		this.loan.click(); 
		
	}
	@FindBy(xpath="//img[@loanid='4']")
	private WebElement view;
	
	public void View() {
		this.view.click();
		
		
	}
	@FindBy(id="amountText")
	private WebElement amount;
	
	public void Amount() {
		this.amount.clear();
	
		this.amount.sendKeys("3000");
		
	}
	@FindBy(xpath="//input[@value='Repay']")
	private WebElement repay;
	
	public void Repay() {
		this.repay.click();
	}
	
	public void alertHandle() {
		Alert alt=driver.switchTo().alert();
		   String alert=alt.getText();
		   System.out.println(alert);
		   alt.accept();
		   alt.accept();
	}
	
	@FindBy(xpath="//li[@id='menu6']//span[2]")
	private WebElement logout;
	
	public void logout() {
		this.logout.click();
	}
		public void alertHandle1() {
		Alert alt2=driver.switchTo().alert();
		   String alert2=alt2.getText();
		   System.out.println(alert2);
		   alt2.accept();
		   
	}
	
	@FindBy (id="cyclosUsername")
	private WebElement username1;
	
	public void sendUsername1(String username){
		this.username1.clear();
		this.username1.sendKeys(username);
	}
	
	@FindBy(id="cyclosPassword")
	private WebElement password1;
	
	public void sendPassword1(){
		this.password1.click(); 
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement Button11;
	
	public void PassBtn11(){
		this.Button11.click(); 
	}
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement Button22;
	
	public void PassBtn22(){
		this.Button22.click(); 
	}
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement Button33;
	
	public void PassBtn33(){
		this.Button33.click(); 
	}
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement Button44;
	
	public void PassBtn44(){
		this.Button44.click(); 
	}
	@FindBy(xpath="//*[@id='virtualKeyboard']//div[2]//table//tbody//tr[2]/td/input[3]")
	private WebElement SubmitBtn1;
	
	public void SubmitBtn1(){
		this.SubmitBtn1.click(); 
	}
	@FindBy(id="memberUsername")
	private WebElement memberUserName;
	
	public void memberLogin1(String memberlogin) {
		this.memberUserName.clear();
		this.memberUserName.sendKeys(memberlogin);
	}
	
	
	@FindBy(xpath="//input[@linkurl='searchLoans?memberId=10']")
	private WebElement loanview;
	public void LoanView() {
		
		this.loanview.click();
	}
	@FindBy(xpath="//*[contains(text(),'Search results')]")
	private WebElement result;
		public void AssertionHandler()
		{
		
		String expected = "Search1 results";
		  String actual = this.result.getText();
		  Assert.assertEquals(expected, actual);
		  System.out.println("Tested");
		}	  
		
	}
	
	

