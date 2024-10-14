package testCases;

import java.time.Duration;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationAccountPage;
import testbase.BaseClass;

public class TC001_AccountRegistration extends BaseClass {

	
	@Test
	public void verify_account_registration() throws Exception 
	{
	
		logger.info("***** Started TC001_AccountRegistration ******");
		try {
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("Clicked on MyAccountLink");
		hp.clickMyAccount();
		
		logger.info("Clicked on Register button");
		hp.clickRegister();
		
		RegistrationAccountPage rap= new RegistrationAccountPage(driver);
		
		logger.info("Providing Customer Details");
		rap.setFirstName(randomstring().toUpperCase());
		rap.setLastName(randomstring().toUpperCase());
		rap.setEmail(randomstring().toUpperCase()+"@gmail.com");
		rap.setTelephone(randomstringNumeric());
		
		String pwd= password();
		
		rap.setPassword(pwd);
		rap.setcnfpwd(pwd);
		
		rap.setPrivacypolicy();
		rap.clickcontinue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("Validating Expected message");
		String cnfmsg =rap.getConfirmationMsg();
		Assert.assertEquals(cnfmsg, "Your Account Has Been Created!");
		
	}
		catch(Exception e) 
		{
			logger.debug("debug Logs");
			logger.error("error Logs");
			Assert.fail();
		}
	}
	
}
