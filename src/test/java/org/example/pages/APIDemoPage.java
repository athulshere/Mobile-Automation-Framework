package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.runner.RunCucumberTest ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APIDemoPage {
    AppiumDriver driver;
    public APIDemoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Access'ibility\"]")
    private WebElement DemoScreen;

    public void verifyApiDemoScreen() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("hohhhhh"+driver);
        DemoScreen.click();
        System.out.println("sadad");
        Thread.sleep(4000);
    }

//    public void verifyApiDemoScreen() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(DemoScreen)).click();
//    }
}
