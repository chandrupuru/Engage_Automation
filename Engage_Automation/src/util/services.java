package util;

import static org.apache.logging.log4j.LogManager.getLogger;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class services {
	 private static Logger logger = getLogger(services.class.getName());
	    protected WebDriver driver;

	    public services(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void waitForElement(String locator) {
	        new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	    }

	    public void click(String locator) {
	        driver.findElement(By.xpath(locator)).click();
	    }

	    protected void clickViaCss(String locator) {
	        driver.findElement(By.cssSelector(locator)).click();
	    }

	    protected void type(String locator, String text) {
	        driver.findElement(By.xpath(locator)).sendKeys(text);
	    }

	    protected void typeViaCss(String locator, String text) {
	        driver.findElement(By.cssSelector(locator)).sendKeys(text);
	    }

	    protected void type(String method, String locator, String text) {
	        if (method.equalsIgnoreCase("xpath"))
	            driver.findElement(By.xpath(locator)).sendKeys(text);
	        else if (method.equalsIgnoreCase("css"))
	            driver.findElement(By.cssSelector(locator)).sendKeys(text);
	        else
	            driver.findElement(By.id(locator)).sendKeys(text);
	    }

	    protected void assertElementPresentByXpath(String locator) {
	        logger.info("# Verifying element.");
	        assertTrue(isElementPresent(locator), "Element " + locator + " not found.");
	    }

	    protected void assertElementNotPresentByXpath(String locator) {
	        logger.info("# Verifying element.");
	        assertFalse(isElementPresent(locator), "Element " + locator + " is found.");
	    }

	    protected boolean isElementPresent(String locator) {
	        try {
	            driver.findElement(By.xpath(locator));
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

	    private boolean isElementVisible(String locator) {
	        try {
	            return driver.findElement(By.xpath(locator)).isDisplayed();
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

	    protected void assertElementVisible(String locator, boolean isVisible) {
	        logger.info("# Verifying element visibility.");
	        if (isVisible)
	            assertTrue(isElementVisible(locator), "Element " + locator + " should be visible.");
	        else
	            assertFalse(isElementVisible(locator), "Element " + locator + " should not be visible.");
	    }

	    public void waitForElementVisible(String locator) {
	        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	    }

	    protected void waitForElementInVisible(String locator) {
	        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
	    }
	   
	    protected WebElement getWebElement(String xpath) {
	        return driver.findElement(By.xpath(xpath));
	    }
	    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
	    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	    	 File DestFile=new File(fileWithPath);
             FileUtils.copyFile(SrcFile, DestFile);
	    }
	}