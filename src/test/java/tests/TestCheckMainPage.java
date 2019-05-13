package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExpenseTrackerMainPage;

public class TestCheckMainPage extends TestBase{

    @Test
    public void init() throws Exception {

        String expectedLoginInputfield = "";
        String expectedPasswordInputfield = "";

        ExpenseTrackerMainPage navigateHomePage = PageFactory.initElements(driver, ExpenseTrackerMainPage.class);

        navigateHomePage.clickAddExpenseTab();

        navigateHomePage.clickListExpenseTab();

        navigateHomePage.clickListCategoriesTab();

        navigateHomePage.clickShowStatisticsTab();

        navigateHomePage.inputLoginField();
        navigateHomePage.inputPasswordField();

        navigateHomePage.clickResetButton();

        String actualLoginInputField = navigateHomePage.getLoginFieldText();
        String actualPasswordInputField = navigateHomePage.getPasswordFieldText();

        Assert.assertEquals(expectedLoginInputfield, actualLoginInputField);
        Assert.assertEquals(expectedPasswordInputfield, actualPasswordInputField);

        }

    }

