package pages.smallBusinessPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SmallBusinessPage {

    private WebDriver driver;

    public SmallBusinessPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void setWindowSize(int height, int width) {
        driver.manage().window().setSize(new Dimension(height, width));
    }
}
