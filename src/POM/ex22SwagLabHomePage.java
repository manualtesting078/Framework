package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex22SwagLabHomePage 
{
	@FindBy(xpath = "//button[text()='Open Menu']")  private WebElement Menu;
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement AddToCart;
	
	WebDriver driver;
	
	public ex22SwagLabHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void VerifyTitleSwagLab() 
	{
		String ActTitle = driver.getTitle();
		String ExpTitle="Swag Labs";
		if(ActTitle.equals(ExpTitle)) {
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	}	
	public void ClickAddToCart() 
	{
		AddToCart.click();
	}
	
	public void ClickSwagLabMenuBtn() 
	{
		Menu.click();
	}
	
	
	
	
	
	

}
