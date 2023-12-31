package BaseClass_UtilityClass;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import zmq.ZError.IOException;

public class SwagLabTest extends BaseClass
{
	
	SwagLabLoginPage Login;
	SwagLabHomePage Home;
	SwagLabMenuPage Menu;
	int TCID;

	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		OpenChromeBrowser();
		Login=new SwagLabLoginPage(driver);
		Home=new SwagLabHomePage(driver);
		Menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		Login.inpSwagLabUN(UtilityClass.getDataFromPropertyFile("UN"));
		Thread.sleep(2000);
		Login.inpSwagLabPWD(UtilityClass.getDataFromPropertyFile("PWD"));
		Thread.sleep(2000);
		Login.clickSwagLabLoginBtn();
	}
	@Test(priority = 0)
	public void verifyTitle() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID=01;
		String actTitle = Home.getSwagLabHomePageTitle();
		String expTitle =UtilityClass.getTestData(1, 4);
		Assert.assertEquals(actTitle, expTitle,"FAILED: if Title mismatch");
		
	}
	@Test(priority = 1)
	public void AddToCart() throws InterruptedException 
	{
		TCID=02;
		Home.clickAddTocart();
		Thread.sleep(2000);
		Home.clickOnSwagLabCartLogo();
		Thread.sleep(2000);
		
		
	}
	@AfterMethod
	public void LogoutApp(ITestResult Result) throws InterruptedException, IOException 
	{
		if(Result.getStatus() == ITestResult.FAILURE)
		{
			UtilityClass.FailedTestCasesScreenshot(driver, TCID);
		}
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
