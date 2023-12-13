package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_SwagLabLoginPage 
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement Login;
	
	public Ex1_SwagLabLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpSwagLabLoginPageUN(String Username)
	{
		UN.sendKeys(Username);
	}
	
	public void InpSwagLabLoginPagePWD(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void ClickSwagLabLoginPageBtn()
	{
		Login.click();
	}
	

}
