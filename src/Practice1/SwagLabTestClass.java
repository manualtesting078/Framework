package Practice1;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zmq.ZError.IOException;

public class SwagLabTestClass extends BaseClass
{
	 String browser = null;
	Sheet sheet;
	//WebDriver driver;
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;

	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation\\xcel\\SouceLab.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("DDF");
		
		
		initialiseBrowser();//(browser);
		login=new SwagLabLoginPage(driver);
		home=new SwagLabHomePage(driver);
		menu=new  SwagLabMenuPage(driver);
	}
	
	@BeforeMethod
	public void SwagLabLogin() throws InterruptedException {
		login.inpEnterSwagLabUN(sheet.getRow(2).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		login.inpEnterSwagLabPWD(sheet.getRow(3).getCell(3).getStringCellValue());
		Thread.sleep(1000);
		login.clickOnSwagLabLoginBtn();
	}
	@Test
	public void verifyTitle()
	{
	 String actTitle = home.verifySwagLabTitle();
	 String expTitle=sheet.getRow(1).getCell(4).getStringCellValue(); 
	 Assert.assertEquals(actTitle, expTitle);
	}
	@Test
	public void AddTocart() throws InterruptedException 
	{
		home.clickSwagLabAddToCart();
		Thread.sleep(1000);
		home.clickSwagLabAddToCartLogo();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void Logout() throws InterruptedException 
	{
		home.clickSwagLabMenuBtn();
		Thread.sleep(1000);
		menu.clickOnSwagLabLogoutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}
	
	
	
	
	
	
}
