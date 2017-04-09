package com.setup;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

public class StartAndStopAppium {

  static AppiumDriverLocalService service;
  private static String APPIUMSERVERSTART = "/Applications/Appium.app/Contents/Resources/node/bin/node,/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js,/Users/ashwin/Desktop/log.txt";
  static String path[] = APPIUMSERVERSTART.split (",", 3);
  private static String NODEJSPATH = path[0];
  private static String APPIUMJSPATH = path[1];
  private static String APPIUMLOGFILEPATH = path[2];

  public static void startAppiumServer (String sPlatformIpAddress,String port) {
    
    /*int port1=Integer.parseInt (port);

    service = AppiumDriverLocalService
        .buildService (new AppiumServiceBuilder ().usingDriverExecutable (new File (NODEJSPATH))
            .withAppiumJS (new File (APPIUMJSPATH)).withLogFile (new File (APPIUMLOGFILEPATH)).withIPAddress (sPlatformIpAddress).usingPort (port1));
*/
    service = AppiumDriverLocalService.buildDefaultService();
    service.start();

    
    //service.start ();

    //Log.info ("Appium server started");

  }

  public static void stopAppiumServer () {

    /*service = AppiumDriverLocalService
        .buildService (new AppiumServiceBuilder ().usingDriverExecutable (new File (NODEJSPATH))
            .withAppiumJS (new File (APPIUMJSPATH)).withLogFile (new File (APPIUMLOGFILEPATH)));
*/
    service.stop ();

    //Log.info ("Appium server stopped");

  }

}
