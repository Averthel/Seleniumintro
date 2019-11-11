package tests;

import org.testng.annotations.Test;
import page.object.*;

import static org.testng.Assert.assertEquals;


public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserTryProceedToCheckout() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnFishlink();

        FishListPage fishSubpage = new FishListPage(driver);
        fishSubpage.angelFishMenu();

        AngelfishListPage angelfishListPage = new AngelfishListPage(driver);
        angelfishListPage.addSmallAngelFish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCheckout();

        LoginPage loginPage = new LoginPage(driver);
        String message = loginPage.getWarningMessage();

        assertEquals(message, "You must sign on before attempting to check out. Please sign on and try checking out again.");

    }

}
