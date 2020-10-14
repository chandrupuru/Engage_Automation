package util;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class init extends drivers {
	private static final String URL = "https://engagetest.fanisko.com/login";

    protected static  WebDriver driver = null;
    private static final long IMPLICIT_TIME = 5;
    private static Logger logger = getLogger(init.class.getName());


public void setUp() {
    logger.info("# Setup.");
    driver = getDriver();
    driver.get(URL);
    driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME, SECONDS);
    driver.manage().window().maximize();
}



public void teardown() {
    logger.info("# Teardown.");
    if (driver != null)
        driver.quit();
}


}
