package org.example.setup;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver driver;

    public static AppiumDriver setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set up capabilities for Android or iOS
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("app", "/Users/athuls/Documents/athulsProjects/MobileAutomationFramework/src/main/java/app/ApiDemos-debug.apk");
        capabilities.setCapability("deviceName", "Athul 12");
        capabilities.setCapability("automationName", "UiAutomator2");

        // Add additional capabilities as needed
        System.out.println(capabilities.getCapability("platformName"));
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);

//        // Initialize the driver based on the platform
//        if (capabilities.getCapability("platformName").equals("ANDROID")) {
//            System.out.println("DRIVER Indu:" + driver);
//            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//            System.out.println("DRIVER IS:" + driver);
//        } else if (capabilities.getCapability("platformName").equals("iOS")) {
//            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//        }

        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}
