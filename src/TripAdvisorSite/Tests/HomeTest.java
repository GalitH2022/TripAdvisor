package TripAdvisorSite.Tests;

import TripAdvisorSite.Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.tripadvisor.com/");

        //Create object of HomePage
        HomePage homePage = new HomePage(driver);

        homePage.clickCherry();
        homePage.printHeader();
        homePage.printList();
        base.seleniumClose(driver);

    }
}
