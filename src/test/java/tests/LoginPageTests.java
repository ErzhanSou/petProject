package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class LoginPageTests {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void loginTest() {
        driver.get(Config.getProperty("sauceDemo"));
        loginPage.userNameInputField.sendKeys(Config.getProperty("sauceUser"));
        loginPage.passwordInputField.sendKeys(Config.getProperty("saucePassword"));
        loginPage.loginButton.click();




    }
}
