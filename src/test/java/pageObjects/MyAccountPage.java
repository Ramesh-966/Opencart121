package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement MyAccounttxt;
	
	public boolean MyAccountPageExists() 
	{
		try {
			return (MyAccounttxt.isDisplayed());
		} catch (Exception e) {
			
			return false;
		}
		
	}
	
}
