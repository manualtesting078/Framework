package TestNg;

import org.testng.annotations.Test;

public class ex3_TestNG_keyword_DependentsOnGroup
{

    @Test(dependsOnGroups = { "SignIn" })
    public void ViewAcc() {
        System.out.println("SignIn Successful");
    }
 
    @Test(groups = { "SignIn" })
    public void LogIn() {
        System.out.println("Logging In Success");
    }
    @Test(priority = -1 ,groups = { "SignIn" })
    public void LogIn1() {
        System.out.println("Logging In Success1");
    }
}


