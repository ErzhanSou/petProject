package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InformationPage {

    public InformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(css = "button[class='error-button']")
    public WebElement errorMessageFirstNameIsRequired;

    @FindBy(id = "first-name")
    public WebElement firstNameInputField;

    @FindBy(id = "last-name")
    public WebElement lastNameInputField;

    @FindBy(id = "postal-code")
    public WebElement zipCodeInputField;
}
