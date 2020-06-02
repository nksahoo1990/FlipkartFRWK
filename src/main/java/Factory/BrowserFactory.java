package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigDataProvider;

public class BrowserFactory {
	
	// Made as static in variable as well as in method, so can access with class name
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome")){
			ConfigDataProvider config= new ConfigDataProvider();
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver1){
		driver1.quit();
	}

}
