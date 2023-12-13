package POM_With_DDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1111_SwagLabMenuPage 
{
	@FindBy(xpath = "//a[text()='Logout']") private WebElement Logout;
	
	public Ex1111_SwagLabMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogoutBtn() 
	{
		Logout.click();
	}
}

