import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    protected WebDriver driver;

    public void setupDriver() {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "/Users/jzhangmon/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    public void closeBrowser() {
        // Close the browser
        driver.quit();
    }
}
