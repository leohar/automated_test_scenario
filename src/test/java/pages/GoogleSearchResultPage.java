package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchResultPage {
    WebDriver driver;

    public GoogleSearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how=How.XPATH, using="//div[contains(@class, 'r')]/a") WebElement firstResultLink;

    public String firstResultgetLink() {
        String resultLink = firstResultLink.getAttribute("href");
        return resultLink;
    }

}
