package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_testNG_Keyword_Timeouts {

	
	@Test (priority = 4,timeOut = 1)
	public void Login1() {Reporter.log("Login1....",true);}

	

	@Test (priority = 3,timeOut = 1)
	public void Login2() {Reporter.log("Login2....",true);}

	@Test (priority = 2,timeOut = 1)
	public void Login3() {Reporter.log("Login3.....",true);}

	@Test(priority = 1,timeOut = 1)
	public void login4() {Reporter.log("Login4......",true);}
	
	@Test (priority = 0,timeOut = 1)
	public void Login5() {Reporter.log("Login5.....",true);}


}
