package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;
import Factory.BrowserFactory;
import Pages.HomePage;

public class FL_Suite1 
{

	ConfigDataProvider config;
	ExcelDataProvider excel;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowserUrl()
	{
		extent=new ExtentReports("F:\\SeleniumFramework\\com.testselenium.framework\\Reports\\ExecutionReport.html", false);
		logger=extent.startTest("Verification of test case started.");
		logger.log(LogStatus.INFO, "Opening browser.");
		driver=BrowserFactory.getBrowser("Chrome");
		config=new ConfigDataProvider();
		String appUrl=config.getApplicationUrl();
		driver.get(appUrl);
		logger.log(LogStatus.INFO, "Application is running.");
		
	}
	
	@Test
	public void verifyPageTitle()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		String actualTitle=home.getApplicationTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actualTitle, expectedTitle,"Verification of page title");
		logger.log(LogStatus.PASS, "Verification of application title is successful.");
		
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		excel= new ExcelDataProvider();
		String username=excel.getData("Credentials", 1, 0);
		String password=excel.getData("Credentials", 1, 1);
		home.LoginToApplication(username,password);
		logger.log(LogStatus.PASS, "Login to Application is successful.");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		BrowserFactory.closeBrowser(driver);
		extent.endTest(logger);
		extent.flush();
	}
}
