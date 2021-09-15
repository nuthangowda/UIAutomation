package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.SeleniumDriver;

import java.io.File;

public class AfterActions {
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/jpeg", "image");
    }




}

