package testcase;

import obj.loginpage;
import util.init;
import util.services;

public class invalidlogin extends init {
	 
		public static void main(String[] args) throws Exception {
			
			init init = new init();
			services ser= new services(driver);
			init.setUp();
			loginpage loginPage = new loginpage(driver);
	   	 	loginPage.loginAction("chandhru_testenv@gmail.com", "Fanisko12");
	   	 	Thread.sleep(5000);
	   	 	ser.takeSnapShot(driver,"C:\\Users\\JARVIS\\Pictures\\sel screenshots\\invaildlogin.jpg");
	   	 	init.teardown();
		}
}
