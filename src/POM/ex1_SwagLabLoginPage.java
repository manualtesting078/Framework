package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex1_SwagLabLoginPage {

	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement Login;
	
	ex1_SwagLabLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void InpSwagLabLoginPageUN() {
		UN.sendKeys("standard_user");
	}
	
	public void InpSwagLabLoginPagePWD() {
		PWD.sendKeys("secret_sauce");
	}
	public void ClickSwagLabLoginPageLogin() {
		Login.click();
	}
	
	
	
	
}
