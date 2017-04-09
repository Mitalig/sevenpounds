package com.setup;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


import io.appium.java_client.android.AndroidDriver;

public class WebDriverFactory 
{
   
  static AppiumDriver create(String platform,String deviceName, String  platformName,String platformVersion,
			String appPackage,String appActivity, String sPlatformAppPath, String sPlatformIpAddress,String deviceId, String port) throws IllegalAccessException
	{
		try  {
		AppiumDriver <WebElement> driver;
		switch(platform)
		{
		case "Device":
		  DesiredCapabilities capabilities= new DesiredCapabilities ();
		      capabilities.setCapability ("deviceName",deviceName );
		      capabilities.setCapability ("platformName", platformName);
		      capabilities.setCapability ("platformVersion", platformVersion);
		      File f = new File (sPlatformAppPath);
		      capabilities.setCapability ("app", f.getAbsolutePath ());
		      driver = new AndroidDriver (new URL ("http://" + sPlatformIpAddress + ":"+port+"/wd/hub"),
		            capabilities);

		   break;
		   
		case "Cloud":
		  
		  DesiredCapabilities caps = new DesiredCapabilities ();
		  caps.setCapability ("deviceName", deviceName);
		  caps.setCapability ("platformName", platformName);
		  caps.setCapability ("platformVersion", platformVersion);
		  caps.setCapability ("appiumVersion", "1.5.3");
		  caps.setCapability ("maxDuration", "10800");
		  caps.setCapability("idleTimeout", 1000);
		  caps.setCapability ("app", "sauce-storage:JabongOnlineFashionShopping.apk");
      driver = new AndroidDriver (
            new URL ("http://" + "bigdecisions" + ":"
                + "4215e133-8d5d-40dc-b44d-4e265f8bce6e" + "@ondemand.saucelabs.com:80/wd/hub"),
            caps);
      
			   break;  
	    
		case "Emulator":
		  Runtime.getRuntime ().exec ("open -a " + "/Applications/Genymotion.app/Contents/MacOS/player.app"
          + " --args --vm-name " + "GoogleNexus");
      Thread.sleep (40000);
		  DesiredCapabilities emul= new DesiredCapabilities ();
		  emul.setCapability ("deviceName",deviceName );
		  emul.setCapability ("platformName", platformName);
		  emul.setCapability ("platformVersion", platformVersion);
		  emul.setCapability ("appPackage",appPackage);
		  emul.setCapability ("appActivity", appActivity);
		  emul.setCapability ("udid", deviceId);

      //File f1 = new File (sPlatformAppPath);
      //emul.setCapability ("app", f1.getAbsolutePath ());
       driver = new AndroidDriver <WebElement> (new URL ("http://" + sPlatformIpAddress + ":"+port+"/wd/hub"),
          emul);
     // driver.installApp (f1.getAbsolutePath ());
			   break;  	   
			   
		default: 
			throw new IllegalAccessException();	 
			   			
		}
		
		return driver;
		}
		catch ( Exception e)  {

			e.printStackTrace();
		}
		return null;

		
	}
}
