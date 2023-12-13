package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1111_SwagLabTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		ex1_SwagLabLoginPage Login=new ex1_SwagLabLoginPage(driver);
		Login.InpSwagLabLoginPageUN();
		Thread.sleep(1000);
		Login.InpSwagLabLoginPagePWD();
		Thread.sleep(1000);
		Login.ClickSwagLabLoginPageLogin();
		
		ex11_SwagLabHomePage Home=new ex11_SwagLabHomePage(driver);
		Home.VerifyTitle();
		
		Home.ClickSwaglabHomePageMenu();
		Thread.sleep(1000);
		
		Ex111_SwgLabMenuPage Logout=new Ex111_SwgLabMenuPage(driver);
		Logout.ClickSwagLabMenuLogoutBtn();
		driver.quit();
		
		
		
	}
}
