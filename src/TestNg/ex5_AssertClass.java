package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex5_AssertClass
{
	@Test
	public void TC1_Equal() 
	{
		String ExpResult="xyz";
		String ActResult="xyz";
		
		Assert.assertEquals(ExpResult, ActResult,"Fail if both result are diffrent: ");
	}
	@Test
	public void TC2_NotEqual() 
	{
		String ExpResult1="xyz";
		String ActResult1="xy";
		
		Assert.assertNotEquals(ExpResult1, ActResult1,"Fail if both result are same:- ");
	}
	@Test
	public void TC3_true() {
		boolean ActResult = true;
		Assert.assertTrue(ActResult);
	}
	@Test
	public void TC4_true() {
		boolean ActResult = false;
		Assert.assertTrue(ActResult,"ActResult is false:- ");
	}
	
	@Test
	public void TC6_false() {
		boolean ActResult = true;
		Assert.assertFalse(ActResult,"ActResult is true:- ");
	}
	@Test
	public void TC5_false() {
		boolean ActResult = false;
		Assert.assertFalse(ActResult);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
