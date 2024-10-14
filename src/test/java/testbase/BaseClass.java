package testbase;


import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
public static WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass
	@Parameters({"OS","browser"})
	public void setup(String os,String br) throws Exception
	{
		
	logger=LogManager.getLogger(this.getClass());
	
FileReader file= new FileReader("./src//test//resources/config.properties");
p= new Properties();
p.load(file);

	switch(br.toLowerCase()) {
	
	case "chrome": driver=new ChromeDriver();break;
	case "firefox": driver=new FirefoxDriver();break;
	case "edge": driver=new EdgeDriver();break;
	default : System.out.println("Invalid browser");return;
	}
	
	
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(p.getProperty("appURL"));
	driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	public String randomstring() 
	{
		String generatedrandomstring =RandomStringUtils.randomAlphabetic(5);
		return generatedrandomstring;
	}
	
	public String randomstringNumeric() 
	{
		String generatedrandomNumeric =RandomStringUtils.randomAlphanumeric(10);
		return generatedrandomNumeric;
	}
	
	public String password() 
	{
		String generatedrandomstring =RandomStringUtils.randomAlphabetic(3);
	    String generatedrandomNumeric =RandomStringUtils.randomAlphanumeric(3);
		return(generatedrandomstring+"$"+generatedrandomNumeric);
	}
}
