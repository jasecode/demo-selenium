public class MainClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.setupDriver();

        GoogleHomePage googleHomePage = new GoogleHomePage(base.driver);
        googleHomePage.openHomePage();
        googleHomePage.searchFor("Mentorcruise");

        if (googleHomePage.isSearchResultTitleCorrect("Mentorcruise")) {
            System.out.println("Test Passed: The title contains 'Mentorcruise'");
        } else {
            System.out.println("Test Failed: The title does not contain 'Mentorcruise'");
        }

        base.closeBrowser();
    }
}
