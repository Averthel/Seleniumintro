package tests;

import driver.manager.DriverUtils;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.object.TopMenuPage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static navigation.ApplicationURLs.TOP_MENU_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MainPageTests extends TestBase {

    @Test
    public void navigationLinksListTest(){
        DriverUtils.navigateToPage(TOP_MENU_PAGE_URL);

        List<String> listOfHrefAttributes = new LinkedList<String>();
        listOfHrefAttributes.add("FISH");
        listOfHrefAttributes.add("DOGS");
        listOfHrefAttributes.add("REPTILES");
        listOfHrefAttributes.add("CATS");
        listOfHrefAttributes.add("BIRDS");
        listOfHrefAttributes.sort(String::compareToIgnoreCase);

        TopMenuPage topMenuPage = new TopMenuPage();
        assertThatListIsCorrect(topMenuPage.getLeftNavigationLinksList(), listOfHrefAttributes);
        assertThatListIsCorrect(topMenuPage.getBottomNavigationLinksList(), listOfHrefAttributes);
        assertThatListIsCorrect(topMenuPage.getTopNavigationLinksList(), listOfHrefAttributes);
    }


    private void assertThatListIsCorrect(List<WebElement> actualListOfWebElements, List<String> expectedListOfStrings) {
        List<String> listOfHrefAttributes = new LinkedList<>();
        for (WebElement listElement : actualListOfWebElements) {
            assertTrue(listElement.isDisplayed());
            String hrefCategory = listElement.getAttribute("href").split("&categoryId=")[1];
            listOfHrefAttributes.add(hrefCategory);
        }
        listOfHrefAttributes.sort(String::compareToIgnoreCase);

        TopMenuPage topMenuPage = new TopMenuPage();
        if (actualListOfWebElements == topMenuPage.getBottomNavigationLinksList()) {
            assertEquals(actualListOfWebElements.size() - 1, expectedListOfStrings.size());
        }
        assertEquals(actualListOfWebElements.size(), expectedListOfStrings.size());

        if (actualListOfWebElements == topMenuPage.getBottomNavigationLinksList()){
            listOfHrefAttributes.remove(0);
            assertEquals(Arrays.toString(listOfHrefAttributes.toArray()), Arrays.toString(expectedListOfStrings.toArray()));
        }
        assertEquals(Arrays.toString(listOfHrefAttributes.toArray()), Arrays.toString(expectedListOfStrings.toArray()));

    }
}
