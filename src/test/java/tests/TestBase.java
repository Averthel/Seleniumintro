package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;

public class TestBase {


    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}
