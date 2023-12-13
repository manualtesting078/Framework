package BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.ZError.IOException;

public class BaseClass
{
	WebDriver driver;
	
	public void OpenChromeBrowser() throws IOException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get(UtilityClass.getDataFromPropertyFile("URL"));
	}

}
