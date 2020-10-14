package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import obj.loginpage;
import util.init;

public class testlogin extends init {
	@DataProvider
    public static Object[][] validCredentials() {
        return new Object[][]{{"tomsmith", "SuperSecretPassword!"}};
    }

    @DataProvider
    public static Object[][] invalidCredentials() {
        return new Object[][]{{"abc", "abc"}};
    }

    @Test(dataProvider = "validCredentials")
    public void testLogin(String username, String password) {
    	 loginpage loginPage = new loginpage(driver);
    	 loginPage.loginAction(username, password);
    }
    	 
    @Test(dataProvider = "validCredentials")
    public void testLoginUsingXpath(String username, String password) {
        

        loginpage loginPage = new loginpage(driver);
        loginPage.loginAction(username, password);
    }
     @Test(dataProvider = "validCredentials")
     public void loginandlogout(String username, String password) {
    	 loginpage loginPage = new loginpage(driver);
     	 loginPage.loginAction(username, password);
     }
     @Test(dataProvider = "invalidCredentials")
     public void testLoginWithInvalidUser(String username, String password) {
         
    	 loginpage loginPage = new loginpage(driver);
         loginPage.loginAction(username, password);
     }
}


