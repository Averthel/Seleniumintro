package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.object.TopMenuPage;

import static navigation.ApplicationURLs.TOP_MENU_PAGE_URL;
import static org.testng.Assert.assertTrue;


public class SearchTests extends TestBase {

    @Test
    public void searchFishTest(){
        DriverUtils.navigateToPage(TOP_MENU_PAGE_URL);

        TopMenuPage topMenuPage = new TopMenuPage();

        boolean isGoldfishImageFishDisplayed = topMenuPage
                .typeIntoSearchField("fish")
                .clickOnSearchButton()
                .isGoldfishImgDisplayed();

        assertTrue(isGoldfishImageFishDisplayed);

        boolean isAngelFishImageDisplayed = topMenuPage
                .typeIntoSearchField("fish")
                .clickOnSearchButton()
                .isAngelfishImgDisplayed();

        assertTrue(isAngelFishImageDisplayed);

    }
}
