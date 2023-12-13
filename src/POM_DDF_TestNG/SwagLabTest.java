package POM_DDF_TestNG;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import zmq.ZError.IOException;

public class SwagLabTest
{
	WebDriver driver=null;
	SwagLabLoginPage Login;
	SwagLabHomePage Home;
	SwagLabMenuPage Menu;
	Sheet sheet;
	@Parameters("browser")
	@BeforeClass
	public void OpenBrowser(String browser) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation\\xcel\\SouceLab.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("DDF");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		Login=new SwagLabLoginPage(driver);
		Home=new SwagLabHomePage(driver);
		Menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	public void LoginToApp() throws InterruptedException 
	{
		
		Login.inpSwagLabUN(sheet.getRow(2).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		Login.inpSwagLabPWD(sheet.getRow(3).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		Login.clickSwagLabLoginBtn();
	}
	@Test(priority = 0)
	public void verifyTitle() throws InterruptedException 
	{
		String actTitle = Home.getSwagLabHomePageTitle();
		String expTitle = sheet.getRow(1).getCell(4).getStringCellValue();
		Assert.assertEquals(actTitle, expTitle,"FAILED: if Title mismatch");
		Home.clickSwagLabMenuBtn();
		Thread.sleep(2000);
		Menu.clickOnSwagLabLogout();
	}
	@Test(priority = 1)
	public void AddToCart() throws InterruptedException {
		Home.clickAddTocart();
		Thread.sleep(2000);
		Home.clickOnSwagLabCartLogo();
		Thread.sleep(2000);
		Home.clickSwagLabMenuBtn();
		Thread.sleep(2000);
		Menu.clickOnSwagLabLogout();
		
	}
	
	
	
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
