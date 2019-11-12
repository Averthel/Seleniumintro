package tests;

import configuration.ConfigurationProperties;
import configuration.PropertiesLoader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;

import java.util.Properties;

import static navigation.ApplicationURLs.APPLICATTION_URL;

public class TestBase {

    @BeforeClass
    public void beforeClass(){
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
    }

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATTION_URL);
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}
