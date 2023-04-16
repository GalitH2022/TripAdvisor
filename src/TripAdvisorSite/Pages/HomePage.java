package TripAdvisorSite.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    //Locating the "Cherry Blossoms" link element via partiallinktext and storing it in the webelement.
    @FindBy(partialLinkText = "Cherry")
    WebElement cherry;

    @FindBy(tagName = "h1")
    WebElement header;

    @FindBys(@FindBy(tagName = "h2"))
    List<WebElement> list;

    private WebDriver driver;

    //Constructor.
    public HomePage(WebDriver driver) {
        this.driver = driver;

        //Initialise Elements.
        PageFactory.initElements(driver, this);
    }

    public void clickCherry() {
        cherry.click();
    }

    public void printHeader() {
        String Header = header.getText();
        System.out.println(Header + ".");
    }

    //Printing out a list of the best places to see the cherry blossoms.
    public void printList() {
        for (WebElement PlacesList : list) {
            String ListOfPlaces = PlacesList.getText();
            System.out.println(ListOfPlaces);
        }
    }
}
