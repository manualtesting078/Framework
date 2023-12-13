package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_testNG_Keyword_Group {

	
	@Test (priority = 4,groups = "Smoke")
	public void Login6() {Reporter.log("Login6....",true);}

	@Test (priority = 3,groups = "Smoke")
	public void Login7() {Reporter.log("Login7....",true);}

	@Test (priority = 2,groups = "Smoke")
	public void Login8() {Reporter.log("Login8.....",true);}

	@Test(priority = 1,groups = "Reg")
	public void login9() {Reporter.log("Login9......",true);}
	
	@Test (priority = 0)
	public void Login10() {Reporter.log("Login10.....",true);}


}
