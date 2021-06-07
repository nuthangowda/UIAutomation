package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import pages.locators.WelcomePageLocators;
import utils.SeleniumDriver;

public class WelcomePageActions {

WelcomePageLocators welcomePageLocators = null;
public WelcomePageActions(){
    this.welcomePageLocators = new WelcomePageLocators();
    PageFactory.initElements(SeleniumDriver.getDriver(),welcomePageLocators);
}

public void clickOnNotification(){

    welcomePageLocators.notification.click();
}

public String  getNotificationText(){
   return  welcomePageLocators.notificationText.getText();
}

public void clickOnGetStarted(){
    welcomePageLocators.getStarted.click();
}
public void enterTextMessage(String greeting) throws InterruptedException {
    SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
    welcomePageLocators.startOver.click();
    welcomePageLocators.messageBox.sendKeys(greeting,Keys.ENTER);
}

public String getEnterTextMessageText(){
    return welcomePageLocators.greetingResponse.getText();
}
}
