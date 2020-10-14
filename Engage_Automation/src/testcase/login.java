package testcase;

import util.init;
import util.services;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import obj.loginpage;

public class login extends init {
 
	public static void main(String[] args) throws Exception {
		
		init init = new init();
		services ser= new services(driver);
		init.setUp();
		loginpage loginPage = new loginpage(driver);
   	 	loginPage.loginAction("chandhru_testenv@gmail.com", "Fanisko123");
   	 	Thread.sleep(5000);
   	 	ser.takeSnapShot(driver,"C:\\Users\\JARVIS\\Pictures\\sel screenshots\\login.jpg");
   	 	init.teardown();
	}
}
