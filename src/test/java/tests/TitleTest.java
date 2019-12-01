package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.ClassDataProvider;

import static org.testng.Assert.assertEquals;

public class TitleTest extends TestBase {

    @Severity(SeverityLevel.MINOR)
    @Test(dataProviderClass = ClassDataProvider.class, dataProvider = "remoteDataProvider")
    @Description("The goal of this test is to check the title of the page")
    public void pageTitleTest(String query, String expectedTitle){
        DriverUtils.navigateToPage(query);
        String pageTitile = DriverManager.getWebDriver().getTitle();
        assertEquals(pageTitile, expectedTitle);
    }
}
