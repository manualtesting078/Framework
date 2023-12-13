package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{

	WebDriver driver;
	//@Parameters("OpenBrowser")
	public void initialiseBrowser()//(String OpenBrowser) 
	{
		
		driver=new ChromeDriver();
		
		
//	if(OpenBrowser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}	
//		else if(OpenBrowser.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com");
	}
}
