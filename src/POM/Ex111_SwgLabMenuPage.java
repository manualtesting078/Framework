package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex111_SwgLabMenuPage {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement Logout;
	
	public Ex111_SwgLabMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSwagLabMenuLogoutBtn() {
		Logout.click();
	}
	
}
