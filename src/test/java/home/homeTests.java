package home;

import base.ChromeBaseTests;
import base.FirefoxBaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homePage.HomePage;
import pages.personalPage.PersonalPage;

public class homeTests extends FirefoxBaseTests {

    @Test
    public void testPersonalHome() {
        PersonalPage personalPage = url.getPersonalUrl();
        personalPage.setWindowSize(1000,1000);

        String title = "PNC Personal Banking";
        Assert.assertEquals(title, personalPage.pageTitle());

        personalPage.clickMenuDropDownButton();
    }

    @Test
    public void testSmallBusiness() {

    }

    @Test
    public void testCorporateAndInstitutional() {

    }
}
