package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;

public class TC002_LoginTestCase extends BaseClass{

	@Test
	public void VerifyLogin() throws Exception {
		
		
		logger.info("**** TC002_LoginTestCase started *****");
		//HomePage
		logger.info("clicked on MyAccount");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		
		logger.info("clicked on Login");
		hp.clickLogin();
		
		Thread.sleep(5);
		//LoginPage
		logger.info("Entered Login Details");
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(p.getProperty("email"));
		lp.setPassword(p.getProperty("Password"));
		lp.ClickLogin();
		
		Thread.sleep(5);
		logger.info("Validating Login");
		MyAccountPage MA = new MyAccountPage(driver);
		boolean targetmsg =MA.MyAccountPageExists();
		
		//Assert.assertEquals(targetmsg, true, "Login Failed");
		
		Assert.assertTrue(targetmsg);
		
		logger.info("**** TC002_LoginTestCase Finished *****");
	}
}
