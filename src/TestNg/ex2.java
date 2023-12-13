package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex2 
{
	@Test
	public void TC1() throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://google.com");
		Thread.sleep(3000);
	}
	
	@Test
	public void TC2() 
	{
		System.out.println("Running TC2");
	}
	@Test
	public void TC3() 
	{
		Reporter.log("running TC3",true);
		System.out.println("TC3");
	}
	
	

}
