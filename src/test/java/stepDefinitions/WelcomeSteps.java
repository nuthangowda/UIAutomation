package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.actions.WelcomePageActions;
import utils.SeleniumDriver;

public class WelcomeSteps {
    WelcomePageActions welcomePageActions = new WelcomePageActions();

    @Given("I navigate to Home page {string}")
    public void i_navigate_to_home_page(String url) {
        SeleniumDriver.openPage(url);
    }

    @When("click on notification get that text and get into bot")
    public void click_on_notification_get_that_text_and_get_into_bot() {
        try {
            welcomePageActions.clickOnNotification();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("click on get started button")
    public void click_on_get_started_button(){
        welcomePageActions.clickOnGetStarted();
    }

    @When("validate the text post notification click {string}")
    public void validate_the_text_post_notification_click(String expected) {
        Assert.assertEquals(expected,welcomePageActions.getNotificationText());
    }

    @Then("enter greetings message say {string}")
    public void enter_greetings_message_say(String greeting) throws InterruptedException {
       welcomePageActions.enterTextMessage(greeting);
    }

    @Then("validate the greetings message response {string}")
    public void validate_the_greetings_message_response(String greetingResp) {
        Assert.assertEquals(greetingResp,welcomePageActions.getEnterTextMessageText());
    }

}
