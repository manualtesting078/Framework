package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1_Sample2
{
	@Test(enabled = false)
	void TC6() {Reporter.log("Running TC6",true);}
	
	@Test
	void TC7() {Reporter.log("Running TC7",true);}
	
	@Test
	void TC8() {Reporter.log("Running TC8",true);}
	
	@Test
	void TC9() {Reporter.log("Running TC9",true);}
	
	@Test(enabled = false)
	void TC10() {Reporter.log("Running TC10",true);}
	
	

}
