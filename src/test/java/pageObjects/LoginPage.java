package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement EMailAddress;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement Login;
	
	public void setEmailAddress(String email) 
	{
		EMailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd) 
	{
		Password.sendKeys(pwd);
	}
	
	public void ClickLogin() 
	{
		Login.click();
	}
}
