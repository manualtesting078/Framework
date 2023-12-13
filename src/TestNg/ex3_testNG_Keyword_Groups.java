package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_testNG_Keyword_Groups {

	
	@Test (priority = 4,groups = "Smoke")
	public void Login1() {Reporter.log("Login1....",true);}

	@Test (priority = 3,groups = "Smoke")
	public void Login2() {Reporter.log("Login2....",true);}

	@Test (priority = 2,groups = {"Smoke","Reg"})
	public void Login3() {Reporter.log("Login3.....",true);}

	@Test(priority = 1,groups = "Reg")
	public void login4() {Reporter.log("Login4......",true);}
	
	@Test (priority = 0,groups = "Reg")
	public void Login5() {Reporter.log("Login5.....",true);}


}
