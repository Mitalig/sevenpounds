package com.setup;

import io.appium.java_client.AppiumDriver;

public class MobileSetup {

	public static ThreadLocal<AppiumDriver> dr = new ThreadLocal<AppiumDriver>();

	public static void setMobile(String platform, String deviceName, String platformName, String platformVersion,
			String appPackage, String appActivity, String sPlatformAppPath, String sPlatformIpAddress, String deviceId,
			String port) throws Exception {
		StartAndStopAppium.startAppiumServer(sPlatformIpAddress, port);
		if (platformName.equalsIgnoreCase("Android")) {
			AppiumDriver driver = new WebDriverFactory().create(platform, deviceName, platformName, platformVersion,
					appPackage, appActivity, sPlatformAppPath, sPlatformIpAddress, deviceId, port);
			setWebDriver(driver);

		} else if (platform.equalsIgnoreCase("Chrome")) {
			System.out.println(platform);

			System.setProperty("webdriver.chrome.driver", "Log4jConfiguration/chromedriver");
			AppiumDriver driver = new WebDriverFactory().create(platform, deviceName, platformName, platformVersion,
					appPackage, appActivity, sPlatformAppPath, sPlatformIpAddress, deviceId, port);
			setWebDriver(driver);

		} else {
			AppiumDriver driver = new WebDriverFactory().create(platform, deviceName, platformName, platformVersion,
					appPackage, appActivity, sPlatformAppPath, sPlatformIpAddress, deviceId, port);
			setWebDriver(driver);

		}

	}

	public static void setWebDriver(AppiumDriver driver) {
		dr.set(driver);
	}

	public static AppiumDriver getDriver()

	{
		return dr.get();
	}

	public static void shutMobile() {
		AppiumDriver driver = getDriver();
		driver.quit();
		StartAndStopAppium.stopAppiumServer();

	}

}
