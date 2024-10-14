package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	 
	//invoking the constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")   //My Account link
	WebElement linkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement linkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
	WebElement LoginLink;

// Action methods
public void clickMyAccount() {
	linkMyaccount.click();
}

public void clickRegister() {
	linkRegister.click();
}

public void clickLogin() {
	LoginLink.click();
}

}
