package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex2_Sample1_Groups
{
	@Test(groups = "Login")
	void TC1() {Reporter.log("Running TC1",true);}
	
	@Test(groups = "setting")
	void TC2() {Reporter.log("Running TC2",true);}
	
	@Test(groups = "setting")
	void TC3() {Reporter.log("Running TC3",true);}
	
	@Test(groups = "logout")
	void TC4() {Reporter.log("Running TC4",true);}
	
	@Test(groups = "Login")
	void TC5() {Reporter.log("Running TC5",true);}
	
	

}
