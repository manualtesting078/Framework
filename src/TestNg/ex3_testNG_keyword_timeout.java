package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_testNG_keyword_timeout {

	@Test(priority = 0,description = "TC1 i.e. login",groups = "smoke")
	public void TC1() {Reporter.log("Running TC1",true);}

	@Test(priority = 1 ,timeOut = 3000,groups = "smoke")
	public void TC2() throws InterruptedException 
	{
//		Thread.sleep(8000);
		Reporter.log("Running TC2",true);
	}

	@Test(priority = 2,dependsOnGroups = "smoke")
	public void TC3() {Reporter.log("Running TC3",true);}

	@Test(priority = 3,dependsOnGroups = "smoke")
	public void TC4() {Reporter.log("Running TC4",true);}

}
