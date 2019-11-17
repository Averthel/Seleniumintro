package driver.manager;

import driver.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static configuration.TestRunProperties.getBrowserToRun;
import static configuration.TestRunProperties.getIsRemoteRun;
import static driver.BrowserType.FIREFOX;

public class DriverManager {

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager(){
    }

    public static WebDriver getWebDriver(){
        if(webDriverThreadLocal.get()==null){
            webDriverThreadLocal.set(new BrowserFactory(getBrowserToRun(), getIsRemoteRun()).getBrowser());
        }
        return webDriverThreadLocal.get();
    }

    public static void disposeDriver(){
        webDriverThreadLocal.get().close();
        if(!getBrowserToRun().equals(FIREFOX)) {
            webDriverThreadLocal.get().quit();
        }
        webDriverThreadLocal.remove();
    }
}
