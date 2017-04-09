package com.setup;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartAndStopAppium {

	static AppiumDriverLocalService service;
	private static String APPIUMSERVERSTART = "/Applications/Appium.app/Contents/Resources/node/bin/node,/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js,/Users/ashwin/Desktop/log.txt";
	static String path[] = APPIUMSERVERSTART.split(",", 3);
	private static String NODEJSPATH = path[0];
	private static String APPIUMJSPATH = path[1];
	private static String APPIUMLOGFILEPATH = path[2];

	public static void startAppiumServer(String sPlatformIpAddress, String port) {

		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

	}

	public static void stopAppiumServer() {

		service.stop();

	}

}
