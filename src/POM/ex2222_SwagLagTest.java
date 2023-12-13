package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2222_SwagLagTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		ex2_SwaglabLoginPage Login=new ex2_SwaglabLoginPage(driver);
		Login.InpSwagLabUN();
		Thread.sleep(1000);
		Login.InpSwagLabPWD();
		Thread.sleep(1000);
		Login.ClickSwaglabLogibBtn();
		
		ex22SwagLabHomePage Home=new ex22SwagLabHomePage(driver);
		Home.VerifyTitleSwagLab();
		
		Home.ClickAddToCart();
		Thread.sleep(1000);
		Home.ClickSwagLabMenuBtn();
		
		ex222_SwagLabMenuPage Menu=new ex222_SwagLabMenuPage(driver);
		Menu.ClickSwabLabLogoutBtn();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
	}
	
	
	
	
}
