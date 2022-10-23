package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.homePage.HomePage;

public class ChromeBaseTests {

    private WebDriver driver;

    protected HomePage url;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        url = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
}
