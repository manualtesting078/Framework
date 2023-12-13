package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex4_verification_assertEqual1 
{ 	
	@Test
	void assertEqual() {
		String ExpResult="abc";
		String ActResult="abc";
		Assert.assertEquals(ExpResult, ActResult,"Result is as expected");
	//	Assert.fail("FAILED:assertEqual Failed intentionally");
	}
	@Test
	void assertEqual1() {
		String ExpResult="abc";
		String ActResult="xyz";
		Assert.assertEquals(ExpResult, ActResult,"Result is failed- ");
	}
	@Test
	void asertNotEqual() {
		String ExpResult="abc";
		String ActResult="xyz";
		Assert.assertNotEquals(ExpResult, ActResult,"Both Result Diffrent TC Passed");
	}
	@Test
	void asertNotEqual1() {
		String ExpResult="abc";
		String ActResult="abc";
		Assert.assertNotEquals(ExpResult, ActResult,"Both Result same TC Failed");
	}
	
	
	
	
	
	
}
