package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.actions.WebActions.scrollIntoView;

public class CreateAccountPage extends WebPageBase {

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By passwordField = By.id("password");
    private final By firstNameField = By.id("firstname");

    private final By lastNameField = By.id("lastname");
    private final By emailField = By.id("email_address");
    private final By confirmationPassword = By.id("password-confirmation");
    private final By createAccountBtn = By.cssSelector("button.action.submit.primary");

    public void sentPassword(String password) {
        webDriver.findElement(passwordField).sendKeys(password);
    }

    public void sentConfirmationPassword(String password) {
        webDriver.findElement(confirmationPassword).sendKeys(password);

    }


    public void sentEmail(String emailAddress) {
        webDriver.findElement(emailField).sendKeys(emailAddress);

    }


    public void sentFirstName(String firstName) {
        webDriver.findElement(firstNameField).sendKeys(firstName);

    }

    public void sentLastName(String lastName) {
        webDriver.findElement(lastNameField).sendKeys(lastName);

    }

    public void scrollToCreateAccountField(WebDriver driver) {
        WebElement webElement = webDriver.findElement(createAccountBtn);
        scrollIntoView(driver, webElement);
    }

    public void clickCreateAccount() {
        webDriver.findElement(createAccountBtn).click();
    }

}
