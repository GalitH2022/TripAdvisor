package TripAdvisorSite.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RestaurantsPage {
    @FindBy(linkText = "Restaurants")
    WebElement restaurantsLink;

    @FindBy(css = "input[placeholder='Where to?']")
    WebElement search;

    @FindBy(css = "label[for='checkbox_342']")
    WebElement kosher;

    @FindBy(css = "label[for='checkbox_361']")
    WebElement sushi;

    @FindBy(className = "SgeRJ")
    WebElement results;

    @FindBys(@FindBy(tagName = "h3"))
    List<WebElement> list;

    private WebDriver driver;

    public RestaurantsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRestaurants() {
        restaurantsLink.click();
    }

    public void searchViaCity(String cityToEnter) {
        search.clear();
        search.sendKeys(cityToEnter);
        search.submit();
    }

    public void filterResults() throws InterruptedException {
        kosher.click();
        sushi.click();
        Thread.sleep(3000);

    }

    public void printOutResults() {
        System.out.printf("--------------------------------------%n");

        String Results = results.getText();
        System.out.println(" " + Results);

        System.out.printf("--------------------------------------%n");

        for (WebElement RestList : list) {
            String ListOfRest = RestList.getText();
            System.out.println("  " + ListOfRest);

        }


    }

}



