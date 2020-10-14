package util;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivers {
	 private static Logger logger = getLogger(drivers.class.getName());

	    public WebDriver getDriver() {
	        String browser = System.getProperty("browser");
	        if (browser == null)
	            browser = "chrome";
	        logger.info("# WebDriver instance for browser: " + browser);

	        if (browser.equalsIgnoreCase("chrome"))
	            return new ChromeDriver();
	        else if (browser.equalsIgnoreCase("ie"))
	            return new InternetExplorerDriver();
	        else {
	            return new FirefoxDriver();
	        }
	    }

}
