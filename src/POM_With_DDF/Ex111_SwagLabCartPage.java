package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex111_SwagLabCartPage 
{
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']") private WebElement ProductName;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement ContiShop;
	WebDriver driver;
	
	public Ex111_SwagLabCartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyProdName(String ExpTitle) 
	{
		String ActTitle = ProductName.getText();
		System.out.println("ActName-"+ActTitle);
		System.out.println("ExpName-"+ExpTitle);
		if(ActTitle.equals(ExpTitle))
		{
			System.out.println("ProductName TC Pass");
		}
		else
		{
			System.out.println("ProductName TC Fail");
		}
	}
	
	public void ClickOnContiShoppingBtn() 
	{
		ContiShop.click();
	}
	
}
