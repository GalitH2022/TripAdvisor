package TripAdvisorSite.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class LoginPage {
    @FindBy(xpath = "//*[@id=':lithium-Rhj5t5eH1:']/div/ul/li[3]/a")
    WebElement joinLink;

    @FindBy(xpath = "//*[@id='ssoButtons']/button/span[2]")
    WebElement continueWEmail;

    @FindBy(xpath = "//*[@id='regSignUp']/div[2]/div[7]/button[2]/span")
    WebElement signin;

    @FindBy(id = "regSignIn.email")
    WebElement email;

    @FindBy(id = "regSignIn.password")
    WebElement pw;

    @FindBy(xpath = "//*[@id='regSignIn']/div[4]/button[1]")
    WebElement submit;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Sign in Via Email Address.
    public void signInViaEmail(String emailToEnter, String pwToEnter) throws InterruptedException {
        joinLink.click();
        continueWEmail.click();
        signin.click();

        email.click();
        email.clear();
        email.sendKeys(emailToEnter);

        pw.click();
        pw.clear();
        pw.sendKeys(pwToEnter);

        submit.click();
        Thread.sleep(5000);

    }
}
