package org.example.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.When;
import org.example.pages.APIDemoPage;
import org.example.pages.CustomViewPage;
import org.example.runner.RunCucumberTest;

public class CustomViewStepDefinitions {
    private final AppiumDriver driver = RunCucumberTest.getDriver();
    private final CustomViewPage customViewPage = new CustomViewPage(driver);

    @When("user gets into Accounts screen")
    public void user_gets_into_accounts_screen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Just checking");
        customViewPage.getBack();
    }
}
