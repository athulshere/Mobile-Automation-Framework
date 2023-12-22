package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomViewPage {
    AppiumDriver driver;
    public CustomViewPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Custom View\"]")
    private WebElement CustomViewButton;

    public void verifyCustomViewButton() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("kkk"+driver);
        CustomViewButton.click();
        System.out.println("rrr");
        Thread.sleep(4000);
    }
    public void getBack(){
        System.out.println("Shooo");
    }
}
