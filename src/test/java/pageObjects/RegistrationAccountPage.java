package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationAccountPage extends BasePage {

	
	//Constructor to invoke parent class
	public RegistrationAccountPage(WebDriver driver) {
		super(driver);
	}

	
	//Locators

	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtFirstName;

	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txtLastName;

	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;

	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPasswd;

	@FindBy(xpath="//input[@placeholder='Password Confirm']") 
	WebElement txtpwdconfrm;

	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkpolicy;

	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnsubmit;

	@FindBy(xpath="//div[@id='content']/h1") 
	WebElement msgConfirmation;
	
	//Action Methods
	public void setFirstName(String Fname) {
		txtFirstName.sendKeys(Fname);
	}
	
	public void setLastName(String Lname) {
		txtLastName.sendKeys(Lname);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setTelephone(String phone) {
		txtTelephone.sendKeys(phone);
	}
	
	public void setPassword(String pwd) {
		txtPasswd.sendKeys(pwd);
	}
	
	public void setcnfpwd(String pwd) {
		txtpwdconfrm.sendKeys(pwd);
	}
	
	public void setPrivacypolicy() {
		chkpolicy.click();
	}
	
	public void clickcontinue() {
		btnsubmit.click();


	}

	public String getConfirmationMsg(){
		
		try {
			
			return(msgConfirmation.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return(e.getMessage());
		
	}


}
}
