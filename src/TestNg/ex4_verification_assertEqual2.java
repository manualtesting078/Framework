package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ex4_verification_assertEqual2 
{
	WebDriver driver;
	//@FindBy(xpath = "//i[@class='fa fa-logo ws-hover-text-green']") private WebElement logo;
	@BeforeClass
	void OpenBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.w3schools.com/");
		
		}
	@Test
	void VerifyTitle() {
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		String ExpTitle="W3Schools Online Web Tutorials";
		Assert.assertEquals(ActTitle,ExpTitle);
	}
	@Test
	void logo() {
		WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']"));
		boolean Result = logo.isDisplayed();
		Assert.assertTrue(Result, "FAILED Logo Is not displayed: ");
	}
	
	@AfterClass
	void CloseBrowser() 
	{
		driver.quit();
	}
	
	
	
	
	
}
