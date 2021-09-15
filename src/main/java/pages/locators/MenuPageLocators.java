package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPageLocators {

    @FindBy(how= How.LINK_TEXT,using="Download Motor Policy")
    public WebElement downloadPolicy;

    @FindBy(how= How.XPATH,using="//div[normalize-space()='Please click on the below button to download copy of your motor policy.']")
    public WebElement downloadPolicyText;

    @FindBy(how= How.LINK_TEXT,using="Download")
    public WebElement download;

    @FindBy(how = How.XPATH, using="//div[normalize-space()='Policy holder details']")
    public WebElement policyHolderDetails;

    @FindBy(how = How.XPATH, using="//input[starts-with(@id,'single_line_text')]")
    public WebElement fullName;

    @FindBy(how = How.XPATH, using="//textarea[starts-with(@id,'data_capture')]")
    public WebElement address;

    @FindBy(how = How.XPATH, using="//label[1]//span[1]")
    public WebElement genderMale;

    @FindBy(how = How.XPATH, using="//input[starts-with(@id,'picklist')]")
    public WebElement select;

    @FindBy(how = How.XPATH, using="//li[normalize-space()='Very Often']")
    public WebElement veryOften;

    @FindBy(how = How.XPATH, using ="//label[normalize-space()='5']")
    public WebElement ratingFiveStar;

    @FindBy(how = How.XPATH, using = "//button[@class='btn default_card_submit']")
    public WebElement submit;

    @FindBy(how = How.XPATH, using = "//strong[normalize-space()='Submitted successfully']")
    public WebElement submitSuccessfully;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Google']")
    public WebElement googleLink;

    @FindBy(how = How.CSS, using = "div[id='webview_body'] button[type='button']")
    public WebElement webView;

    @FindBy(how = How.LINK_TEXT, using = "Call")
    public WebElement call;





}
