package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath ="//input[@id='login-button']" ) private WebElement Login;
	
	public SwagLabLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpEnterSwagLabUN(String Username) 
	{
		UN.sendKeys(Username);
	}
	public void inpEnterSwagLabPWD(String Password) 
	{
		PWD.sendKeys(Password);
	}
	public void clickOnSwagLabLoginBtn() 
	{
		Login.click();
	}
	
	
	
	
	
	
	
	

}
