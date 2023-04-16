package TripAdvisorSite.Tests;

import TripAdvisorSite.Pages.RestaurantsPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class RestaurantsTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.tripadvisor.com/");

        RestaurantsPage restaurantsPage = new RestaurantsPage(driver);

        restaurantsPage.clickRestaurants();
        restaurantsPage.searchViaCity("Restaurants in Aventura");
        restaurantsPage.filterResults();
        restaurantsPage.printOutResults();
        base.seleniumClose(driver);

    }

}
