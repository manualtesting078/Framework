package POM_With_DDF;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.ZError.IOException;

public class Ex11111SwagLabTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream File=new FileInputStream("F:\\Automation\\xcel\\SouceLab.xlsx");
		Sheet sheet = WorkbookFactory.create(File).getSheet("DDF");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(sheet.getRow(1).getCell(3).getStringCellValue());
	
	Ex1_SwagLabLoginPage Login=new Ex1_SwagLabLoginPage(driver);
	Login.InpSwagLabLoginPageUN(sheet.getRow(2).getCell(3).getStringCellValue());
	Thread.sleep(1000);
	Login.InpSwagLabLoginPagePWD(sheet.getRow(3).getCell(3).getStringCellValue());
	Thread.sleep(1000);
	Login.ClickSwagLabLoginPageBtn();
	
	Ex11_SwagLabHomePage Home=new Ex11_SwagLabHomePage(driver);
	Home.VerifySwagLabTitle(sheet.getRow(1).getCell(4).getStringCellValue());
	Home.ClickAddToCart();
	Thread.sleep(2000);
	Home.ClickOnSwagLabHomePageCartIcon();
	Thread.sleep(1000);
	
	Ex111_SwagLabCartPage Cart=new Ex111_SwagLabCartPage(driver);
	Cart.VerifyProdName(sheet.getRow(5).getCell(4).getStringCellValue());
	Cart.ClickOnContiShoppingBtn();
	Thread.sleep(1000);
	Home.ClickOnSwagLabHomePageMenuBtn();
	
	Ex1111_SwagLabMenuPage Menu=new Ex1111_SwagLabMenuPage(driver);
	Menu.ClickOnLogoutBtn();
	Thread.sleep(1000);
	driver.quit();
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
