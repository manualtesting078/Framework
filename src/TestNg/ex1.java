package TestNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex1 {

	@Test
	public void m1() {System.out.println("hiii");}
	
	@Test
	public void m2() {Reporter.log("running m2",true);}
}
