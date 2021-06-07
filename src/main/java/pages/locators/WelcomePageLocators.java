package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WelcomePageLocators {

    @FindBy(how= How.XPATH,using="//div[@class='avm-bot-welcome-notification animated fadeInUp']//h3[1]")
    public WebElement notification;

    @FindBy(how= How.XPATH,using="//p[normalize-space()='Hello and welcome to IRA agent']")
    public WebElement notificationText;

    @FindBy(how= How.CSS,using="textarea[placeholder='Type a message...']")
    public WebElement messageBox;

    @FindBy(how= How.XPATH,using="//p[normalize-space()='Hi there, what can I help you with today?']")
    public WebElement greetingResponse;

    @FindBy(how= How.XPATH,using="//a[@class='get-started-link']")
    public WebElement getStarted;

    @FindBy(how= How.XPATH,using="//a[normalize-space()='Start Over']")
    public WebElement startOver;

}
