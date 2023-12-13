package TestNg;

import org.testng.annotations.Test;

public class ex3_TestNG_keyword_DependentsOnMethod
{

	  @Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() 
	  {
		  System.out.println("This will execute second (SignIn)");
	  }

	 @Test
	  public void OpenBrowser()
	 {
		  System.out.println("This will execute first (Open Browser)");
	  }
	}
