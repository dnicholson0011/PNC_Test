package pages.homePage;

import org.openqa.selenium.WebDriver;
import pages.personalPage.PersonalPage;

public class HomePage {

    private WebDriver driver;

    private String personalUrl = "https://www.pnc.com/en/personal-banking.html";

    private String smallBusinessUrl = "https://www.pnc.com/en/small-business.html?lnksrc=topnav";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public PersonalPage getPersonalUrl() {
        driver.get(personalUrl);
        return new PersonalPage(driver);
    }

    public HomePage getSmallBusinessUrl() {
        driver.get(smallBusinessUrl);
        return new HomePage(driver);
    }
}
