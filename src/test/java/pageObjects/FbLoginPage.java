package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLoginPage extends BasePage {
	
	public FbLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By byun = By.xpath("//input[@id='email']");
	By bypw = By.xpath("//input[@id='pass']");

	
	

	public void Username(String data) {
		
		driver.findElement(byun).sendKeys(data);
			
		}

	public void password(String data) {
		
		driver.findElement(bypw).sendKeys(data);
		
			
		}


}
