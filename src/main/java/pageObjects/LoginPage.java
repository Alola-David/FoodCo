package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Webdriver to handle automation processes on this page
    private WebDriver driver;

    //Constructor class
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate element with id = username
    private By username = By.id ("username");
    //Locate element with id = password
    private By password = By.id ("password");

    //Find location popup and assert location
    public void pickLocation() {
        driver.findElement (By.xpath ("/html/body/div[6]/div[2]/div[1]/form/label[2]")).click ();
    }
    //Method to location account login
    public void selectAccount(){
        driver.findElement (By.xpath ("/html/body/div[2]/div[1]/header/div[1]/div/div[3]/ul/li[1]/a")).click ();
    }
    //Find username field and input data
    public void enterUsername(String uName){
        driver.findElement (username).sendKeys (uName);
    }
    //Find enterpassword field and input data
    public void enterPassword(String ps){
        driver.findElement (password).sendKeys (ps);
    }

    //Transfer control to the next page
    public LandingPage clickLoginBtn(){
        driver.findElement (By.xpath ("/html/body/div[2]/div[2]/div/div/div[1]/div/article/div/div/div/div/div[2]/div[1]/form/p[4]/button")).click ();
        return new LandingPage (driver);
    }
}
