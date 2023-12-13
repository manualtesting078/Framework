package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex11_SwagLabHomePage
{
	@FindBy(xpath = "(//button[text()='Add to cart'])[2]") private WebElement AddProductToCart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement CartIcon;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement Menu;
	WebDriver driver;
	public Ex11_SwagLabHomePage(WebDriver driver) 
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	public void VerifySwagLabTitle(String ExpTitle)
	{
		String ActTitle = driver.getTitle();
		if(ActTitle.equals(ExpTitle)) 
		{
			System.out.println("HomePage TC Pass");
		}
		else
		{
			System.out.println("HomePage TC fail");
		}
	}
	public void ClickAddToCart() 
	{
		AddProductToCart.click();
	}
	
	public void ClickOnSwagLabHomePageCartIcon() 
	{
	CartIcon.click();
	}
	public void ClickOnSwagLabHomePageMenuBtn() 
	{
		Menu.click();
	}	
}
