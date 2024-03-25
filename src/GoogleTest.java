import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class GoogleTest extends BaseClass { // Extends BaseClass, so it inherits its 'driver'
    @Test
    public void firstTest() {
        setupDriver(); // Initializes the inherited 'driver' from BaseClass
        driver.get("https://google.com"); // Uses the 'driver' from BaseClass
        GoogleHomePage googleHomePage = new GoogleHomePage(driver); // Passes the initialized 'driver' to GoogleHomePage
        googleHomePage.searchFor("Mentorcruise");
        if (googleHomePage.isSearchResultTitleCorrect("Mentorcruise")) {
            System.out.println("Test Passed: The title contains 'Mentorcruise'");
        } else {
            System.out.println("Test Failed: The title does not contain 'Mentorcruise'");
        }
        closeBrowser(); // Closes the browser using the method from BaseClass
    }
}
