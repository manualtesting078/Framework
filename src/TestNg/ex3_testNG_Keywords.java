package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_testNG_Keywords 
{

	@Test (invocationCount = 2)
	public void TC1() {Reporter.log("Running TC1",true);}
	
	@Test(enabled = false)
	public void TC2() {Reporter.log("Running TC2",true);}
	
	@Test (enabled = true)
	public void TC3() {Reporter.log("Running TC3",true);}
	
}
