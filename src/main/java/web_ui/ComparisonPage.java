package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonPage extends WebPageBase {
    private final By pageTitle = By.className("page-title");

    public ComparisonPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getPageTitle() {
        return webDriver.findElement(pageTitle).getText();
    }
}
