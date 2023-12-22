package org.example.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.APIDemoPage;
import org.example.pages.CustomViewPage;
import org.example.runner.RunCucumberTest;

public class AlertStepDefinitions {
    private final AppiumDriver driver = RunCucumberTest.getDriver();
    private final APIDemoPage apiDemoPage = new APIDemoPage(driver);
    private final CustomViewPage customViewPage = new CustomViewPage(driver);

    @Given("user is in the App Alert screen")
    public void user_is_in_the_app_alert_screen() throws InterruptedException {
        apiDemoPage.verifyApiDemoScreen();
        System.out.println("Heyyy");
    }
    @When("user clicks on Ok Cancel button")
    public void user_clicks_on_ok_cancel_button() {
        System.out.println("Hoyyy");
    }
    @When("user clicks on Cancel button")
    public void user_clicks_on_cancel_button() {
        System.out.println("Huuu");
    }
    @Then("alert box is closed")
    public void alert_box_is_closed() {
        System.out.println("hiiiii");
    }
    @When("user goes back")
    public void user_goes_back() {
        customViewPage.getBack();
    }
}
