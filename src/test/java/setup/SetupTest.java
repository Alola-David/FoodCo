package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetupTest {
    private WebDriver driver;

    protected LoginPage loginPage;

    @BeforeTest
    public void setup(){
        System.setProperty ("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();

        driver.get("https://foodco.ng/");

        loginPage = new LoginPage (driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit ();
    }

}
