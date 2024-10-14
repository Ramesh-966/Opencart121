package SampleProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.FbLoginPage;
import testbase.BaseClass;

public class Reuse {
	
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php/");
	
	FbLoginPage fbl1= new FbLoginPage(driver);
	
	fbl1.Username("9390687023");
	
	fbl1.password("password");
	
	//driver.quit();
	
}
}
