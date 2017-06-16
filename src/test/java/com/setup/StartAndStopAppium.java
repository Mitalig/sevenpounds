package com.setup;

import java.io.File;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartAndStopAppium {

	//static AppiumDriverLocalService service;
	/*private static String APPIUMSERVERSTART = "/Applications/Appium.app/Contents/Resources/node/bin/node,/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js,/Users/ashwin/Desktop/log.txt";
	static String path[] = APPIUMSERVERSTART.split(",", 3);
	private static String NODEJSPATH = path[0];
	private static String APPIUMJSPATH = path[1];
	private static String APPIUMLOGFILEPATH = path[2];*/
	private static AppiumDriverLocalService service;
	private static AppiumServiceBuilder builder;
	private static DesiredCapabilities cap;

	public static void startAppiumServer(String sPlatformIpAddress, String port) {

		//service = AppiumDriverLocalService.buildDefaultService();
		//service.start();
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
						.usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(
								new File(
										"/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723));
		service.start();
		/*cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");
		
		//Build the Appium service
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("0.0.0.0");
		builder.usingPort(4723);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
		
		//Start the server with the builder
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
*/
	}

	public static void stopAppiumServer() {

		service.stop();

	}

}
