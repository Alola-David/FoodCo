package login;

import org.testng.annotations.Test;
import pageObjects.LandingPage;
import setup.SetupTest;

public class LoginTest extends SetupTest {
    @Test
    public void testLogin() throws InterruptedException {

        /*Login in details*/
        String username = "davorigaga@mailinator.com";
        String password = "FoodCoPassword@2020";

        //Locate picklocation function from loginpage and invoke same
        loginPage.pickLocation ();
        //Locate selectAccount function from loginpage and invoke same
        loginPage.selectAccount ();
        Thread.sleep (2000);
        loginPage.enterUsername(username);
        loginPage.enterPassword (password);

        LandingPage landingPage = loginPage.clickLoginBtn();
        landingPage.makePurchase ();
        landingPage.checkOutCart ();
        loginPage = landingPage.clickLogout ();

    }
}
