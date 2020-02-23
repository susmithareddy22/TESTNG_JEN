package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.Test2POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Test3 {
	private WebDriver driver;
	private String baseUrl;
	private Test2POM Test2POM;
	private static Properties properties;
	private WebDriverWait webDriverWait;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Test2POM = new Test2POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void login(){
		Test2POM.sendUserName("admin");
		Test2POM.PassBtn();
		Test2POM.PassBtn2();
		Test2POM.PassBtn3();
		Test2POM.PassBtn4();
		Test2POM.clickLoginBtn();

		Test2POM.clickMenuText();
	}

	@Test(priority=2, dataProvider="Cyclos",dataProviderClass=LoginDataProviders.class)
	public void validStep_3(String Member_Login,String Subject,String Body) throws InterruptedException{



		Test2POM.clickSubMenuText();
		Test2POM.select_list("Sent items");
		Test2POM.Submit();
		Test2POM.memberUsername(Member_Login);
		Test2POM.subjectText(Subject);
		driver.switchTo().parentFrame();
		Test2POM.body(Body);
		Test2POM.Submit();
		Test2POM.alt();


	}

}
