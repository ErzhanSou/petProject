package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.Config;
import utilities.Driver;

public class TestClass {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CommonPage commonPage = new CommonPage();
    CartPage cartPage = new CartPage();
    InformationPage informationPage = new InformationPage();
    OverviewPage overviewPage = new OverviewPage();
    CompletePage completePage = new CompletePage();
    Faker faker = new Faker();

    @Test
    public void test1() {

        // login page
        Driver.getDriver().get(Config.getProperty("sauceDemo")); // To navigate to www.sauceDemo.com
        loginPage.userNameInputField.sendKeys(Config.getProperty("sauceUser")); // Enters userName
        loginPage.passwordInputField.sendKeys(Config.getProperty("saucePassword")); // Enters userPassword
        loginPage.loginButton.click(); // Clicks on login button

        // product page
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("productPageURL")); // Checks that user was redirected to Product Page
        productPage.addToCartBtnSauceLabsBackpack.click(); // Clicking add to cart button on SauceLabsBackpack item
        Assertions.assertTrue(productPage.removeBtnSauceLabsBackpack.isDisplayed()); // Checking is that remove button is displayed
        Assertions.assertEquals("1", commonPage.numOfItemsInCart.getText()); // Checking is that number of item's is increased by 1
        commonPage.cartButton.click(); // Clicks on cart button

        // cart page
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("cartPageURL"));
        Assertions.assertTrue(cartPage.itemSauceLabsBackpack.isDisplayed());
        Assertions.assertTrue(cartPage.checkoutButton.isDisplayed());
        cartPage.checkoutButton.click();

        // user information page
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("informationPageURL"));
        informationPage.continueButton.click();
        Assertions.assertTrue(informationPage.errorMessageFirstNameIsRequired.isDisplayed());

        // providing personal info
        informationPage.firstNameInputField.sendKeys(faker.name().firstName());
        informationPage.lastNameInputField.sendKeys(faker.name().lastName());
        informationPage.zipCodeInputField.sendKeys(faker.number().digits(5));
        informationPage.continueButton.click();

        // overview page
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("overviewPageURL"));
        Assertions.assertTrue(overviewPage.totalPrice.isDisplayed());
        overviewPage.finishButton.click();

        // complete page
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("completePageURL"));
        Assertions.assertTrue(completePage.thankYouForYourOrder.isDisplayed());
        Assertions.assertTrue(completePage.backHomeButton.isDisplayed());
        completePage.backHomeButton.click();
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(), Config.getProperty("productPageURL"));

        Driver.getDriver().quit();

    }
}
