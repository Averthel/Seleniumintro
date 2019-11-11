package driver.manager;

import driver.manager.DriverManager;

public class DriverUtils {

    public static void setInitialConfiguration(){
        DriverManager.getWebDriver().manage().window().maximize();
    }

    public static void navigateToPage(String pageurl){
        DriverManager.getWebDriver().navigate().to(pageurl);
    }
}
