package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex4_verification_assertTrue 
{
	@Test
	void True1() {
		boolean Result=true;
		Assert.assertTrue(Result);
	}
	@Test
	void True2() {
		boolean Result=false;
		Assert.assertTrue(Result,"Result is FALSE:- ");
	}
	@Test
	void False1() {
		boolean Result=false;
		Assert.assertFalse(Result);
	}
	@Test
	void False2() {
		boolean Result=true;
		Assert.assertFalse(Result,"Result is TRUE:- ");
	}

}
