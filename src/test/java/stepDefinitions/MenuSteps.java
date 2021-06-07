package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.actions.MenuPageActions;
import utils.SeleniumDriver;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;

public class MenuSteps {
    MenuPageActions menuPageActions = new MenuPageActions();

    @Then("click on download motor policy link")
    public void click_on_download_motor_policy_link() {
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        menuPageActions.clickOnDownloadPolicy();
    }

    @Then("validate the text message {string}")
    public void validate_the_text_message(String downloadPolicyText) {
        Assert.assertEquals(downloadPolicyText,menuPageActions.getDownloadPolicyText());
    }

    @Then("click on download link")
    public void click_on_download_link() {
        menuPageActions.clickDownload();

    }
    @Then("validate the title of the webpage {string}")
    public void validate_the_title_of_the_webpage(String webTitle) {
        String parent = SeleniumDriver.getDriver().getWindowHandle();
        Set<String> windowHandles = SeleniumDriver.getDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!parent.equalsIgnoreCase(childWindow)) {
                String childTitle = SeleniumDriver.getDriver().switchTo().window(childWindow).getTitle();
                Assert.assertEquals(webTitle, childTitle);
            }
        }
    }
    @Then("type {string} and click on enter")
    public void type_and_click_on_enter(String message) {
        menuPageActions.enterMessageBox(message);
    }

    @Then("fill the form and submit the details {string} {string}")
    public void fill_the_form_and_submit_the_details(String name, String address) {
        menuPageActions.formFilling(name, address);
    }

    @Then("validate post submitting the form {string}")
    public void validate_post_submitting_the_form(String message) {
       Assert.assertEquals(message, menuPageActions.formSubmit());
    }

    @Then("enter {string} and click on enter")
    public void enter_and_click_on_enter(String newTest) {
        menuPageActions.enterMessageBoxNewTest(newTest);

    }
    @Then("click on Google and close the webview")
    public void click_on_Google_and_close_the_webview() {
       menuPageActions.clickGoogleLink();
       menuPageActions.closeWebView();

    }

    @Then("click on call and close the popup window")
    public void click_on_call_and_close_the_popup_window() throws AWTException {
        menuPageActions.clickCallLink();
        String parent = SeleniumDriver.getDriver().getWindowHandle();
        Set<String> windowHandles = SeleniumDriver.getDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!parent.equalsIgnoreCase(childWindow)) {
                SeleniumDriver.getDriver().switchTo().window(childWindow);
            }
        }
    }





}
