package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.lang.String;

public class GoogleHomePage {

    WebDriver driver;

    public GoogleHomePage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.NAME, name = "q") WebElement searchInputField;
    @FindBy(how=How.CSS, using = "a#gb_70.gb_Pe.gb_Ba.gb_Mb") WebElement loginButton;

    //Defining frequently used variables;
    public String inputString = "yandex.ru";

    // Defining all the user actions (Methods) that can be performed in the Google home page
    // This method enters input in form
    public void inputSearchForm(){
        searchInputField.sendKeys(inputString);
    }
    // This method submits form
    public void submitSearchForm(){
        searchInputField.submit();
    }
    // Other methods for example to verify LoggedIn Username Text
    public String verifyloginButton(){
        String loginButtonText = loginButton.getText();
        Boolean buttonExists = loginButton.isDisplayed();
            if (buttonExists) {
                System.out.println("Login Button with text "+loginButtonText);
            }
            else {System.out.println("There is no login Button");}
        return loginButtonText;
    }
}
