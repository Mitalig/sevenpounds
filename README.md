List of softwares required to run:
Java 
node.js
Android Studio
appium
Eclipse
Set Java Path in environment variable
Create ANDROID_HOME variable and set it's path to sdk folder
Set path to platforms folder and platform-tools folder in environment variable.
In sdk folder of android, click on SDK Manager to download required api level of android.


Clone the project on your machine using command: https://github.com/Mitalig/sevenpounds.git

Open the project in Eclipse IDE.

Open TestNG.xml file present under resources folder.
In TestNG.xml file, provide the path to apk which is present in resources folder of project ( provide the  full path) then change the deviceName to the name of your device and platform version to the version of your android.

Go to Developer Options via Settings options and check USB Debugging option and Connect Mobile phone.

Run the TestNG.xml file present under resources folder. OR Right click on the project and run using TestNG.

Make sure you have appium and related dependencies installed on your system.

The report will be present in file: /sevenpounds/target/html/index.html