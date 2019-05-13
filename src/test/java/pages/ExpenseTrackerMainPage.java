package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.lang.String;

public class ExpenseTrackerMainPage {

    WebDriver driver;

    public ExpenseTrackerMainPage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.ID, id = "login") WebElement loginInputField;
    @FindBy(how=How.ID, id = "password") WebElement passwordInputField;
    @FindBy(how=How.ID, id = "go_add_expense") WebElement addExpenseTab;
    @FindBy(how=How.ID, id = "go_list_expenses") WebElement listExpenseTab;
    @FindBy(how=How.ID, id = "go_list_categories") WebElement listCategoriesTab;
    @FindBy(how=How.ID, id = "go_show_statistics") WebElement showStatisticsTab;
    @FindBy(how=How.ID, id = "reset") WebElement resetButton;

    //Defining frequently used variables;
    public String validUsername = "admin";
    public String validPassword = "password";

    // Defining all the user actions (Methods) that can be performed in the Main page

    public void clickAddExpenseTab() {
            addExpenseTab.click();
    }

    public void clickListExpenseTab() {
            listExpenseTab.click();
    }

    public void clickListCategoriesTab() {
            listCategoriesTab.click();
    }

    public void clickShowStatisticsTab() {
            showStatisticsTab.click();
    }
    // Other methods for example to verify Login/Password input field, get text value, input values

    public Boolean verifyloginInputField(){
        Boolean loginFieldExist = loginInputField.isDisplayed();
        if (loginFieldExist) {
            System.out.println("Login field exists");
        }
        else {System.out.println("Login field doesn't exist"); }
        return loginFieldExist;
    }

    public void inputLoginField(){
        loginInputField.sendKeys(validUsername);
    }

    public String getLoginFieldText() {
        String loginInputText = loginInputField.getText();
        System.out.println("Login text is "+loginInputText);
        return loginInputText;
    }

    public Boolean verifyPasswordInputfield() {

        Boolean passwordFieldExist = passwordInputField.isDisplayed();
        if (passwordFieldExist) {
            System.out.println("Password field exists");
        } else {
            System.out.println("Password field doesn't exist");
        }
        return passwordFieldExist;
    }

    public String getPasswordFieldText() {
        String passwordInputText = passwordInputField.getText();
        System.out.println("Password text is "+passwordInputText);
        return passwordInputText;
    }

    public void inputPasswordField(){
        passwordInputField.sendKeys(validPassword);
    }
    // This method submits reset button
    public void clickResetButton(){
        resetButton.click();
    }
}
