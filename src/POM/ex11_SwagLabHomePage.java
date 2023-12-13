package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex11_SwagLabHomePage {

	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement Menu;
	WebDriver driver;
	
	public ex11_SwagLabHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyTitle() 
	{
		String ActResult = driver.getTitle();
		String ExpResult="Swag Labs";
		if(ActResult.equals(ExpResult))
		{System.out.println("Pass");}
		else
		{System.out.println("Fail");}
	}
	public void ClickSwaglabHomePageMenu() {
		Menu.click();
	}
	
	
	
	
}
