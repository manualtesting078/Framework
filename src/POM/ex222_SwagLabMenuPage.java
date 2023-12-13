package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex222_SwagLabMenuPage {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement Logout;
	
	public ex222_SwagLabMenuPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSwabLabLogoutBtn() {
		Logout.click();
	}
	
	
	
	
	
	
	
}

