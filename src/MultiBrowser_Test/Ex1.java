package MultiBrowser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex1
{
	@Parameters("browser")
	@Test
	void OpenFacebook(String browser) throws InterruptedException {
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		     driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("http:/facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.quit();
	}

}
