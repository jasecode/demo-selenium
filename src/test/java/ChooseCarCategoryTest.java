import org.example.pageObjects.LoginPage;
import org.example.pageObjects.PostAnAddPage;
import org.example.pageObjects.BasePage;
import org.junit.Assert;
import org.junit.Test;

public class ChooseCarCategoryTest extends BaseTest {

    @Test
    public void chooseCar() {
        driver.get("https://public.stg.polovni.dev/");
        PostAnAddPage postAnAddPage = new PostAnAddPage(driver);
        postAnAddPage.chooseCategory();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        postAnAddPage.chooseCategory();
        driver.quit();
    }
}
