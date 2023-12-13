package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex4_verification_assertEqual3
{
	@Test
	void Equal() {
		String ActResult="aaa";
		String ExpResult="aaa";
		Assert.assertEquals(ActResult, ExpResult);
	}
	@Test
	void Equals() {
		String ActResult="aaa";
		String ExpResult="xxx";
		Assert.assertEquals(ActResult, ExpResult,"Result is not same: ");
	}
	@Test
	void NotEqual() {
		String ActResult="aaa";
		String ExpResult="xxx";
		Assert.assertNotEquals(ActResult, ExpResult);
	}
	@Test
	void NotEquals() {
		String ActResult="aaa";
		String ExpResult="aaa";
		Assert.assertNotEquals(ActResult, ExpResult,"Result is not same: ");
	}

}
