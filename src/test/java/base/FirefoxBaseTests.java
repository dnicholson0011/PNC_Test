package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.homePage.HomePage;

public class FirefoxBaseTests {

    private WebDriver driver;

    protected HomePage url;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        url = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
}
