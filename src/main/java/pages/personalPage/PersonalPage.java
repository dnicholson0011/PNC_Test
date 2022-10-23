package pages.personalPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class PersonalPage {

    private WebDriver driver;

    private By menuDropDownButton = By.id("closebtn");

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void setWindowSize(int height, int width) {
        driver.manage().window().setSize(new Dimension(height, width));
    }

    public void clickMenuDropDownButton() {
        driver.findElement(menuDropDownButton).click();
    }
}
