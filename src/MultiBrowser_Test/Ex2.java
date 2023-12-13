package MultiBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex2 
{
	@Parameters("BrowserName")
	@Test
	public void OpenFacebook(String BrowserName) throws Exception 
	{
		WebDriver driver=null;
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
		}
//		else if(BrowserName.equalsIgnoreCase("Edge"))
//		{
//			 driver=new EdgeDriver();
//		}
		else {
			throw new Exception("Browser is not correct");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
