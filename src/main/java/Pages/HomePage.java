package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import DataProvider.ExcelDataProvider;

public class HomePage 
{

	WebDriver driver;
	
	
	public HomePage(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginLink;
	
	@FindBy(xpath="//*[text()='Cart']")
	WebElement cartLink;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement searchProductTextbox;
	
	@FindBy(xpath="//input[@type='text'][@class='_2zrpKA _1dBPDZ']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Login']")
	WebElement loginButton;
	
	public void clickOnLoginLink()
	{	
	loginLink.click();	
	}
	
	public void inputSearchTextbox(String item)
	{	
		searchProductTextbox.sendKeys(item);
	}
	
	public String getApplicationTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void LoginToApplication(String uName,String pwd)
	{
		if(userName.isDisplayed()){
			userName.sendKeys(uName);
			password.sendKeys(pwd);
			loginButton.click();
		}else
		{
			loginLink.click();
			userName.sendKeys("7406268202");
			password.sendKeys("#nitkrish4");
			loginButton.click();
		}
	}
	
}
