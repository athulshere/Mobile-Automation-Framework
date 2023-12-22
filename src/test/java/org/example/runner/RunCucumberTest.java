package org.example.runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.setup.DriverFactory;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static org.example.setup.DriverFactory.setUp;
import static org.example.setup.DriverFactory.tearDown;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/example")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunCucumberTest {
//    static AppiumDriver driver;
    // Setup code before each scenario
    @Before
    public void beforeScenario() throws MalformedURLException {
        System.out.println("Before each scenario");
        // Add your scenario-specific setup code here
        setUp();
    }

    // Teardown code after each scenario
    @After
    public void afterScenario() {
        System.out.println("After each scenario");

    }

//    public static void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        // Set up capabilities for Android or iOS
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "12.0");
//        capabilities.setCapability("app", "/Users/athuls/Documents/athulsProjects/MobileAutomationFramework/src/main/java/app/ApiDemos-debug.apk");
//        capabilities.setCapability("deviceName", "Athul 12");
//        capabilities.setCapability("automationName", "UiAutomator2");
//
//        // Add additional capabilities as needed
//        System.out.println(capabilities.getCapability("platformName"));
//        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//
//        // Initialize the driver based on the platform
//        if (capabilities.getCapability("platformName").equals("ANDROID")) {
//            System.out.println("DRIVER Indu:"+driver);
//            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//            System.out.println("DRIVER IS:"+driver);
//        } else if (capabilities.getCapability("platformName").equals("iOS")) {
//            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//        }
//    }

//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//    public static AppiumDriver getDriver(){
//        return driver;
//    }
      public static AppiumDriver getDriver(){
          return DriverFactory.getDriver();
      }
}
