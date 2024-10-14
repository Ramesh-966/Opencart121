package SampleProgrammes;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mobile {
  
 WebDriver driver = new ChromeDriver();

	@Test
	public  void screenshot() throws Exception {
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();

		Thread.sleep(8000);
		
		System.out.println(driver.getTitle());
		
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		
		WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList"));

		element.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String acttxt = driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).getText();
		System.out.println(acttxt);
		
		String Exptxt= "Create your Amazon account";



		if(acttxt.equalsIgnoreCase(Exptxt)) {
			
			System.out.println("correct");

		}else {

			File destFile= new File(".//Screenshots/screenshot.png");
			TakesScreenshot sch = (TakesScreenshot)driver;
			File srcfile= sch.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,destFile);
		}
	}
	
	public void commethod(String xpath,String data) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/RAMESH RONGALA/Downloads/chromedriver_win32 (1)/chromedriver.exe");


		Mobile mb= new Mobile();
		mb.screenshot();
		
mb.commethod("//input[@id='ap_email']", "rammi338@gmail.com");

		//driver.quit();
		/**WebElement ele =driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("samsung mobile");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(7000);


		List<WebElement> mobmodels=driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//span[@class='a-size-medium a-color-base a-text-normal']"));
		int count =mobmodels.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++) {
			String modelname = mobmodels.get(i).getText();

			if(modelname.equals("Samsung Galaxy M12 (Blue,4GB RAM, 64GB Storage) 6000 mAh with 8nm Processor | True 48 MP Quad Camera | 90Hz Refresh Rate")) {
				System.out.println("selected Mobile data is displayed"+" ========== "+mobmodels.get(i).getText());
				mobmodels.get(i).click();
				break;

			}else {
				System.out.println(i+" : "+modelname);
			}

		}
		System.out.println("2nd title "+" : "+driver.getTitle());**/
}
}



