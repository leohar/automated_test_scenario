package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleSearchResultPage;

public class TestVerifyFirstResultIsYandexUrl extends TestBase{

    @Test
    public void init() throws Exception {

        String expectedUrl = "https://www.yandex.ru/";

        GoogleHomePage navigateHomePage = PageFactory.initElements(driver, GoogleHomePage.class);
        navigateHomePage.inputSearchForm();
        navigateHomePage.submitSearchForm();

        GoogleSearchResultPage navigateResultPage = PageFactory.initElements(driver, GoogleSearchResultPage.class);
        String actualUrl = navigateResultPage.firstResultgetLink();
        System.out.println("First link url leads to "+actualUrl);

        Assert.assertEquals(expectedUrl, actualUrl);
        }

    }

