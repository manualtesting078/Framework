package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement menu;
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement add;
	@FindBy(xpath ="//a[@class='shopping_cart_link']" ) private WebElement cartLogo;
	WebDriver driver;
	
	public SwagLabHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifySwagLabTitle()
	{
		String actTitle = driver.getTitle();
		return  actTitle;
		
	}
	
	public void clickSwagLabAddToCart()
	{
		add.click();
	}
	
	public void clickSwagLabAddToCartLogo() 
	{
		cartLogo.click();
	}
	public void clickSwagLabMenuBtn() 
	{
		menu.click();
	}
	
	
	
	

}
