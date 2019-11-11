package driver.manager;

import driver.BrowserFactory;
import driver.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final BrowserType BROWSER_TYPE = BrowserType.IE;
    private static WebDriver driver;

    private DriverManager(){
    }

    public static WebDriver getWebDriver(){
        if(driver==null){
            driver = BrowserFactory.getBrowser(BrowserType.CHROME);
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if(!BROWSER_TYPE.equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
