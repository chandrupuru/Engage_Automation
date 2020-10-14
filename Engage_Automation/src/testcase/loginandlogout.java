package testcase;

import obj.loginpage;
import util.init;
import util.services;

public class loginandlogout extends init 
{
	public static void main(String[] args) throws Exception {
		init init = new init();
		services ser= new services(driver);
		init.setUp();
		loginpage loginPage = new loginpage(driver);
	 	loginPage.loginAction("chandhru_testenv@gmail.com", "Fanisko123");
	 	Thread.sleep(5000);
	 	ser.takeSnapShot(driver,"C:\\Users\\JARVIS\\Pictures\\sel screenshots\\login&logut(logged in succesfull).jpg");
	 	loginPage.waitForElementVisible(loginpage.profile);
	 	loginPage.click(loginpage.profile);
	 	loginPage.waitForElementVisible(loginpage.logout);
	 	loginPage.click(loginpage.logout);
	 	Thread.sleep(5000);
	 	ser.takeSnapShot(driver,"C:\\Users\\JARVIS\\Pictures\\sel screenshots\\login&logut(logged out succesfully).jpg");
	 	init.teardown();
	
	
	}
}