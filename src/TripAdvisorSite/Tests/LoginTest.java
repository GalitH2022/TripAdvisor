package TripAdvisorSite.Tests;

import TripAdvisorSite.Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.tripadvisor.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.signInViaEmail("taldan861@gmail.com", "tD@01041980");
        base.seleniumClose(driver);

    }
}
