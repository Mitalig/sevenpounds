package com.testrunner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.setup.MobileSetup;
import com.setup.StartAndStopAppium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="Features", format={"pretty","html:target/html/"},glue="com.pagedefinitions")
public class TestRunner extends AbstractTestNGCucumberTests
{
	
   @BeforeClass
   @Parameters({"Platform","deviceName","platformName","platformVersion",
	   "appPackage","appActivity","sPlatformAppPath","sPlatformIpAddress","deviceId","port"})
	public void beforeSetup(String platform,String deviceName, String  platformName,String platformVersion,
			String appPackage,String appActivity, String sPlatformAppPath, String sPlatformIpAddress, String deviceId,  String port ) throws Exception
	{
	   
	   MobileSetup.setMobile( platform, deviceName,   platformName, platformVersion,
			 appPackage, appActivity,  sPlatformAppPath,  sPlatformIpAddress,deviceId,port);
				
	}
   
   @AfterClass
   public void shutDown()  {
     
     MobileSetup.shutMobile ();
   }
   
  
	
}
