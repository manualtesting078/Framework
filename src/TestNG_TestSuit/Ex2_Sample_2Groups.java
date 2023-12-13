package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex2_Sample_2Groups
{
	@Test(groups = "Login")
	void TC6() {Reporter.log("Running TC6",true);}
	
	@Test(groups = "setting")
	void TC7() {Reporter.log("Running TC7",true);}
	
	@Test(groups = "logout")
	void TC8() {Reporter.log("Running TC8",true);}
	
	@Test(groups = "logout")
	void TC9() {Reporter.log("Running TC9",true);}
	
	@Test(groups = "Login")
	void TC10() {Reporter.log("Running TC10",true);}
	
	

}
