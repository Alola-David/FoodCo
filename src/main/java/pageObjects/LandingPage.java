package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By ItemSelect = By.xpath ("//*[@id=\"nav-menu-item-3339\"]/a");
    private By ItemSubCategory = By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/main/div[3]/ul/li[4]/a/span/span[1]");

    public void makePurchase() throws InterruptedException {
        Thread.sleep (5000);
        //Select Category
        driver.findElement (ItemSelect).click();
        Thread.sleep (1000);
        //Select subcategory
        driver.findElement (ItemSubCategory).click();
        Thread.sleep (5000);
        /*Click nextpage button*/
        driver.findElement (By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/main/div[4]/nav/ul/li[2]/a")).click ();
        Thread.sleep (5000);

        //ADD ITEM TO CART
        driver.findElement (By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/main/div[3]/ul/li[9]/div/div[2]/div/div/a")).click ();
        //Wait for 5 seconds to enable continue button to disappear
        Thread.sleep (5000);

        //ADD ITEM TO CART
        driver.findElement (By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/main/div[3]/ul/li[15]/div/div[2]/div/div/a")).click ();
        Thread.sleep (5000);
        //ADD ITEM TO CART
        driver.findElement (By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/main/div[3]/ul/li[19]/div/div[2]/div/div/a")).click ();
        Thread.sleep (5000);
    }

    public void checkOutCart() throws InterruptedException {
        Thread.sleep (5000);
        driver.findElement (By.xpath ("/html/body/div[2]/div[1]/header/div[2]/div/div[4]/div/div[1]")).click ();
        driver.findElement (By.xpath ("/html/body/div[2]/div[1]/header/div[2]/div/div[4]/div/div[2]/div/p[2]/a[2]")).click ();
    }

    public LoginPage clickLogout() throws InterruptedException {
        Thread.sleep (5000);
        driver.findElement (By.xpath ("/html/body/div[2]/div[1]/header/div[1]/div/div[3]/ul/li[3]/a")).click ();
        return new LoginPage(driver);
    }

}
