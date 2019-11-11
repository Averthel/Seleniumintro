package tests;

import org.testng.annotations.Test;
import page.object.*;

import static org.testng.Assert.assertEquals;


public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserTryProceedToCheckout() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink()
                .clickOnFishlink()
                .angelFishMenu()
                .addSmallAngelFish()
                .proceedToCheckout();

        LoginPage loginPage = new LoginPage();
        String message = loginPage.getWarningMessage();

        assertEquals(message, "You must sign on before attempting to check out. Please sign on and try checking out again.");

    }

}
