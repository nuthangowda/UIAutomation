package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    public static SeleniumDriver seleniumDriver;

    //initialize webdriver
    public static WebDriver driver;

    //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private SeleniumDriver() {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver_win32" + "\\chromedriver.exe");
        } else if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver_win32" + "\\chromedriver.exe");
        } else if (os.contains("linux")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver_win32" + "\\chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);


    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() throws InterruptedException {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
        SeleniumDriver.clearBrowserCache();

    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

    public static void waitForPageToLoad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void clearBrowserCache() throws InterruptedException {
        driver.manage().deleteAllCookies(); //delete all cookies
        Thread.sleep(5000); //wait 5 seconds to clear cookies.
    }

}