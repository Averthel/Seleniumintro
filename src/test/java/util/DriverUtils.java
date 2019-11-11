package util;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static void setInitialConfiguration(){
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverManager.getWebDriver().manage().window().maximize();
    }

    public static void navigateToPage(String pageurl){
        DriverManager.getWebDriver().navigate().to(pageurl);
    }
}
