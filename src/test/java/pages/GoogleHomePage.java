package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePage {

    WebDriver driver;

    public GoogleHomePage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.XPATH, using="//div[text()='Account Settings']") WebElement profileDropdown;
    @FindBy(how=How.XPATH, using="//text()[.='Log Out']/ancestor::span[1]") WebElement logoutLink;
    @FindBy(how=How.XPATH, using="///div[text()='Good afternoon, SoftwareTesting!']") WebElement loggedInUserNameText;
    @FindBy(how=How.CLASS_NAME, className = "g") WebElement searchResult;

    // Defining all the user actions (Methods) that can be performed in the Google home page

    // This method to click on Profile Dropdown
    public void clickOnProfileDropdown(){
        profileDropdown.click();
    }
    // This method to click on Logout link
    public void clickOnLogoutLink(){
        logoutLink.click();
    }
    // This method to verify LoggedIn Username Text
    public String verifyLoggedInUserNameText(){
        String userName = loggedInUserNameText.getText();
        return userName;
    }

    public String clickOnFirstSearchResult() {
        String searchUrl = searchResult.getText();
        return  searchUrl;
    }
}
