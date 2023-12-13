package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex3_Anotation 
{
	
	@BeforeSuite
	public void TestSuit() {Reporter.log("TestSuit",true);}
	
	@BeforeTest
	public void BeforeTest() {Reporter.log("BeforeTest",true);}
	
	@BeforeClass
	public void OpenBrowswe() 				//browser open
	{
		Reporter.log("======BeforeClass=======",true);
	}
	@BeforeMethod
	public void LogIn() 
	{
		Reporter.log("---BeforeMethod---",true);
	}

	@Test(priority=2)					//operation perform on menu page
	public void TC1_Profile()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(priority=1)
	public void TC2() 					//Add to cart
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(priority=0)
	public void TC3()              //verify Title
	{
		Reporter.log("Running TC3",true);
	}
	
	@AfterMethod
	public void LogOut() 
	{
		Reporter.log("AfterMethod",true);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("==========AfterClass=======",true);
	}
	
	@AfterSuite
	public void AfterSuit() {Reporter.log("AfterSuite",true);}
	

	@AfterTest
	public void AfterTest() {Reporter.log("AfterTest",true);}
	
	
	
}
