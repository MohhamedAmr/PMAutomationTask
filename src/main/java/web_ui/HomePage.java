package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.actions.WebActions;
import utils.wait.ExplicitDriverWait;

public class HomePage extends WebPageBase {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By createAccountBtn = By.xpath("//a[text()='Create an Account']");
    private final By siteLogo = By.className("logo");

    private final By hotSeller = By.xpath("//h2[@class='title']");

    private final By firstProduct = By.xpath("//a[@title='Radiant Tee']");
    private final By secondProduct = By.xpath("//a[@class='product-item-link' and @title='Breathe-Easy Tank']");
    private final By addToCompareFirstBtn = By.xpath("//li[1]//a[@title='Add to Compare']");
    private final By addToCompareSecondBtn = By.xpath("//li[2]//a[@title='Add to Compare']");

    private final By compareProductsBtn = By.xpath("//a[@title='Compare Products']");
    private final By registrationSuccessMessage = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public void clickCreateAccount() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, createAccountBtn);
        webDriver.findElement(createAccountBtn).click();
    }

    public void clickOnLumaLogo() {
        webDriver.findElement(siteLogo).click();
    }

    public void scrollToHotSellerSection() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, hotSeller);

        WebElement hotSellerElement = webDriver.findElement(hotSeller);

        WebActions.scrollIntoView(webDriver, hotSellerElement);
    }

    public void hoverOnFirstProduct() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, firstProduct);
        WebElement firstProductElement = webDriver.findElement(firstProduct);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(firstProductElement).perform();
    }

    public void hoverOnSecondProduct() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, secondProduct);
        WebElement secondProductElement = webDriver.findElement(secondProduct);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(secondProductElement).perform();
    }

    public void clickFirstProdAddToCompareBtn() {

        webDriver.findElement(addToCompareFirstBtn).click();
    }

    public void clickSecondProdAddToCompareBtn() {

        webDriver.findElement(addToCompareSecondBtn).click();
    }

    public void clickOnCompareProducts() {
        webDriver.findElement(compareProductsBtn).click();
    }

    public WebElement getSuccessMessage() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10, registrationSuccessMessage);
        return webDriver.findElement(registrationSuccessMessage);
    }
}
