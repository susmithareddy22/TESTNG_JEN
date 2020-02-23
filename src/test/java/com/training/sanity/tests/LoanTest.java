package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoanPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class LoanTest {
	private WebDriver driver;
	private String baseUrl;

	private LoanPOM loanPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		 loanPOM = new LoanPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get("http://192.168.43.94:8585");
	}
	
	@AfterMethod
	public void jiraBug(ITestResult result) throws JiraException {
		if(result.getStatus()==ITestResult.FAILURE) {
			BasicCredentials creds = new BasicCredentials("satya","satya0201");
			JiraClient jira= new JiraClient("http://172.24.78.77:9090/",creds);
			Issue issuename = jira.createIssue("CA", "Bug").field(Field.SUMMARY, result.getMethod().getMethodName()+"is failed due to : "+result.getThrowable().toString()).field(Field.DESCRIPTION, "Hello Satya").execute();
			System.out.println("issue is created in jira with issue key "+issuename.getKey());
		}
	}
	
	@Test
	public void validLoanTest() throws InterruptedException  {
		
		loanPOM.sendUsername("satya");
		loanPOM.sendPassword();
		loanPOM.PassBtn1();
		loanPOM.PassBtn2();
		loanPOM.PassBtn3();
		loanPOM.PassBtn4();
		loanPOM.SubmitBtn();
		loanPOM.Account();
		loanPOM.Loans(); 
		loanPOM.View();
		loanPOM.Amount();
		loanPOM.Repay();
		loanPOM.alertHandle();
		loanPOM.logout();
		loanPOM.alertHandle1();
		loanPOM.sendUsername1("admin");
		loanPOM.sendPassword1();
		loanPOM.PassBtn11();
		loanPOM.PassBtn22();
		loanPOM.PassBtn33();
		loanPOM.PassBtn44();
		loanPOM.SubmitBtn1();
		loanPOM.memberLogin1("satya");
		loanPOM.LoanView();
		loanPOM.AssertionHandler();
		  
	}
}
	

  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
