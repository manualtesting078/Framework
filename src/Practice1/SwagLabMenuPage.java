package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage 
{
	@FindBy(xpath = "//a[text()='Logout']") private WebElement Logout;
	
	public SwagLabMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSwagLabLogoutBtn() {
		Logout.click();
	}

}
