package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex2_SwaglabLoginPage 
{
	@FindBy (xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy (xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy (xpath = "//input[@id='login-button']") private WebElement Login;
	
	public ex2_SwaglabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpSwagLabUN() {
		UN.sendKeys("standard_user");
		}
	public void InpSwagLabPWD() {
		PWD.sendKeys("secret_sauce");
	}
	public void ClickSwaglabLogibBtn() {
		Login.click();
		
	}

}
