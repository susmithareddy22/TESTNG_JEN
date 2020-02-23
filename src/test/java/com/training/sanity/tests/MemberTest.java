package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.MemberPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberTest {
	private WebDriver driver;
	private String baseUrl;

	private MemberPOM memberPOM;
	
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
		
		memberPOM = new MemberPOM(driver); 
		
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get("http://192.168.43.94:8585");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest1() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	 memberPOM.sendUsername("admin");
	 memberPOM.sendPassword();
	 memberPOM.PassBtn1();
	 memberPOM.PassBtn2();
	 memberPOM.PassBtn3();
	 memberPOM.PassBtn4();
	 memberPOM.SubmitBtn();
	 
	 memberPOM.Messages();
	//Thread.sleep(3000);
	 memberPOM.subMessages();
	 memberPOM.selectSent();
	 memberPOM.Submit();
	 memberPOM.memberLogin();
	 memberPOM.Subject();
	 
	 driver.switchTo().parentFrame();
	 memberPOM.Body();
	 Thread.sleep(3000);
	 memberPOM.Submit1();
	 
	 memberPOM.alertHandle();
	 
	 memberPOM.AssertionHandler();
	 
	
	}

 
}
