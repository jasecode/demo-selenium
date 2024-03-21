import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
    private WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://www.google.com/");
    }

    public void searchFor(String searchTerm) {
        // Locate the search box by its name attribute
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.submit();
    }

    public boolean isSearchResultTitleCorrect(String searchTerm) {
        // Verify the page title contains the searchTerm
        return driver.getTitle().contains(searchTerm);
    }
}
