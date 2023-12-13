package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex4_verification_SoftAssertMulti_Result {
	SoftAssert soft;
	@Test
	void TC1() 
	{
		soft=new SoftAssert();
		    String ExpResult="abc";
			String ActResult="xxx";
			soft.assertEquals(ExpResult, ActResult,"FAILED:Result is as Not expected");
			
			boolean Result=false;
			soft.assertTrue(Result,"FAILED");
			soft.assertAll();
		}
	
	@Test
	void TC2() {
		soft=new SoftAssert();
		String ExpResult="abc";
		String ActResult="abc";
		soft.assertEquals(ExpResult, ActResult);
		soft.assertAll();
	}
	
	@Test
	void TC3() {
		soft=new SoftAssert();
		String ExpResult="abc";
		String ActResult="xyz";
		soft.assertNotEquals(ExpResult, ActResult);
		soft.assertAll();
	}
	}

