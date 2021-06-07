package pages.actions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.MenuPageLocators;
import pages.locators.WelcomePageLocators;
import utils.SeleniumDriver;


public class MenuPageActions {

    MenuPageLocators menuPageLocators = null;
    WelcomePageLocators welcomePageLocators = new WelcomePageLocators();
    JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
    public MenuPageActions(){
        this.menuPageLocators = new MenuPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),menuPageLocators);
        PageFactory.initElements(SeleniumDriver.getDriver(),welcomePageLocators);
    }

   public void clickOnDownloadPolicy(){
       menuPageLocators.downloadPolicy.click();
    }

   public String getDownloadPolicyText(){
       return menuPageLocators.downloadPolicyText.getText();
   }

   public void clickDownload(){
        menuPageLocators.download.click();
   }

   public void enterMessageBox(String message){
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        welcomePageLocators.startOver.click();
        welcomePageLocators.messageBox.sendKeys(message, Keys.ENTER);
        WebElement element = menuPageLocators.policyHolderDetails;
        js.executeScript("arguments[0].scrollIntoView();", element);
        SeleniumDriver.getDriver().switchTo().defaultContent();
    }

    public void formFilling(String name, String address){
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        menuPageLocators.fullName.sendKeys(name);
        menuPageLocators.address.sendKeys(address);
        menuPageLocators.genderMale.click();
        WebElement element = menuPageLocators.select;
        js.executeScript("arguments[0].scrollIntoView();", element);
        menuPageLocators.select.click();
        menuPageLocators.veryOften.click();
        menuPageLocators.ratingFiveStar.click();
        menuPageLocators.submit.click();
    }

    public String formSubmit(){
        return menuPageLocators.submitSuccessfully.getText();
    }

    public void enterMessageBoxNewTest(String message){
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        welcomePageLocators.startOver.click();
        welcomePageLocators.messageBox.sendKeys(message, Keys.ENTER);
        SeleniumDriver.getDriver().switchTo().defaultContent();
    }

    public void clickGoogleLink(){
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        WebElement element = menuPageLocators.googleLink;
        js.executeScript("arguments[0].scrollIntoView();", element);
        menuPageLocators.googleLink.click();
}

    public void closeWebView(){
        menuPageLocators.webView.click();
    }

    public void clickCallLink(){
        SeleniumDriver.getDriver().switchTo().frame("avaamoIframe");
        WebElement element = menuPageLocators.call;
        js.executeScript("arguments[0].scrollIntoView();", element);
        menuPageLocators.call.click();
    }


}