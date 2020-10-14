package obj;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.services;


public class loginpage extends services {
	
	private String xpathUsername = "//*[@id=\"username\"]";
    private String xpathPassword = "//*[@id=\"password\"]";
    private String xpathLoginBtn = "//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div/div/form/div[3]/input";
    private String xpathMsg = "//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div/div/p";
    private static final String MSG_ERROR = "Invalid user credentials";
    public static String profile ="//*[@id=\"main-content\"]/nav/div/ul[3]/li/a/div/div";
    public static String logout ="//*[@id=\"user-options\"]/li[3]/a";
    
    public loginpage(WebDriver driver) {
		super(driver);
    }	
    public void loginAction(String username, String password) {
	        type(xpathUsername, username);
	        type(xpathPassword, password);
	        click(xpathLoginBtn);
	}
    public void verifyLoginWithInvalidUser(String username, String password) {
		    type(xpathUsername, username);
		    type(xpathPassword, password);
		    click(xpathLoginBtn);
		    waitForElementVisible(xpathMsg);
	        String actualMsg = driver.findElement(By.xpath(xpathMsg)).getText().trim();
	        assertTrue(actualMsg.contains(MSG_ERROR),"Actual '" + actualMsg + "' should be same as expected '" + MSG_ERROR + "'.");
	    
	}
    public void verifyLoginAndLogout(String username, String password) {
        loginAction(username, password);
        waitForElementVisible(profile);
        click(profile);
        waitForElementVisible(logout);
        click(logout);
    }
}

