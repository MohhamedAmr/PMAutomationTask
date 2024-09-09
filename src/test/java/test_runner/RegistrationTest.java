package test_runner;

import constants.DataProviderManagement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import web_ui.CreateAccountPage;
import web_ui.HomePage;

public class RegistrationTest extends WebTestBase {
    HomePage homePage;
    CreateAccountPage createAccountPage;

    @Description("This test attempts to successfully registration cycle")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "checkoutData", dataProviderClass = DataProviderManagement.class)
    public void verifyRegistrationSuccess(String firstName, String lastName, String email, String password) {
        homePage = new HomePage(webDriver);
        createAccountPage = new CreateAccountPage(webDriver);
        homePage.clickCreateAccount();
        createAccountPage.sentFirstName(firstName);
        createAccountPage.sentLastName(lastName);
        createAccountPage.sentEmail(email);
        createAccountPage.scrollToCreateAccountField(webDriver);
        createAccountPage.sentPassword(password);
        createAccountPage.sentConfirmationPassword(password);
        createAccountPage.clickCreateAccount();
        //Assert that User Registered Successfully and Success Message Displayed

        Assert.assertTrue(homePage.getSuccessMessage().getText().contains("Thank you for registering with Main Website Store."));
        Assert.assertTrue(homePage.getSuccessMessage().isDisplayed());


    }
}
