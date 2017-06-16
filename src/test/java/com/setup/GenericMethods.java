package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;



public class GenericMethods {

	public static void click(WebDriver driver, String sLocator) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).click();
	}

	public static void input(WebDriver driver, String sLocator, String inputValue) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).sendKeys(inputValue);
	}

	public static void clickAndroidBackButton(WebDriver driver) {
		((AndroidDriver) driver).pressKeyCode(4);
	}

	public static String getElementText(WebDriver driver, String sLocator) {
		waitMethod(driver, sLocator);
		String elementText = driver.findElement(By.xpath(sLocator)).getText();
		return elementText;
	}

	public static WebElement scrollDownEnd(WebDriver driver, String sLocator) {

		int i = 0;
		while (driver.findElements(By.xpath(sLocator)).size() == 0 && i < 10) {

			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			((AppiumDriver) driver).swipe(0, scrollStart, 0, scrollEnd, 2000);
			i++;

		}
		WebElement scrollTo = ((AndroidDriver) driver).findElement(By.xpath(sLocator));
		return scrollTo;

	}
	
	 public static void swipeLeft (WebDriver driver) {

       int screenWidth = driver.manage ().window ().getSize ().getWidth ();
       int screenHeight = driver.manage ().window ().getSize ().getHeight ();
       // Swipe Left
       int startx = screenWidth / 9;
       int endx = screenWidth * 8 / 9;
       int starty = screenHeight / 2;
       int endy = screenHeight / 2;
       ((AppiumDriver) driver).swipe (startx, starty, endx, endy, 5000);

     }
	 
	 public static void swipeRight (WebDriver driver) {

     

       int screenWidth = driver.manage ().window ().getSize ().getWidth ();
       int screenHeight = driver.manage ().window ().getSize ().getHeight ();
       // Swipe Right
       int startx = screenWidth * 8 / 9;
       int endx = screenWidth / 9;
       int starty = screenHeight / 2;
       int endy = screenHeight / 2;
       ((AppiumDriver) driver).swipe (startx, starty, endx, endy, 5000);


     
   }
     
	 
	 public static boolean isElementPresent(WebDriver driver, String sLocator)  {
			waitMethod(driver, sLocator);
	    boolean elementSize	=driver.findElements(By.xpath(sLocator)).size()>0;
	    return elementSize;
	  }
	 
	 public static boolean isElementPresentWithoutWait(WebDriver driver, String sLocator)  {
	    boolean elementSize	=driver.findElements(By.xpath(sLocator)).size()>0;
	    return elementSize;
	  }
	 

	public static WebElement scrollDown(WebDriver driver, String text) {
		
		try {
		
		WebElement scrollTo = ((AndroidDriver) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView"
						+ "(new UiSelector().textContains(\"" + text + "\").instance(3))");

		return scrollTo;
		
		}
		catch(Exception e)  {
			
			
    }
		return null;

	}

	public static void waitMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 120);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

	}

	public static void waitToClickMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 260);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sLocators)));

	}

	public static void waitFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
