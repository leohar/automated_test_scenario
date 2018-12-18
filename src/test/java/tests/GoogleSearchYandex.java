package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class GoogleSearchYandex extends TestBase{

    @Test
    public void init() throws Exception{

        driver.get("https://www.google.com");
        GoogleHomePage navigate = PageFactory.initElements(driver, GoogleHomePage.class);
        navigate.search();

//        navigate.setEmail("rajkumarsmonline@gmail.com");
//        navigate.setPassword("raj123456");
//        navigate.clickOnLoginButton();
//
//        FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
//        navigate.clickOnProfileDropdown();
//        navigate.verifyLoggedInUserNameText();
//        navigate.clickOnLogoutLink();
   }

}
