package test_runner;

import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import web_ui.ComparisonPage;
import web_ui.HomePage;

public class ProductComparisonTest extends WebTestBase {
    HomePage homePage;
    ComparisonPage comparisonPage;
    @Test
    public void verifyProductsComparison() {
        homePage = new HomePage(webDriver);
        comparisonPage = new ComparisonPage(webDriver);
        homePage.clickOnLumaLogo();
        homePage.scrollToHotSellerSection();
        homePage.hoverOnFirstProduct();
        homePage.clickFirstProdAddToCompareBtn();
        homePage.scrollToHotSellerSection();
        homePage.hoverOnSecondProduct();
        homePage.clickSecondProdAddToCompareBtn();
        homePage.clickOnCompareProducts();
        //Assert that navigated to Compare Products Page Successfully
        Assert.assertEquals(comparisonPage.getPageTitle(),"Compare Products");

    }
}
