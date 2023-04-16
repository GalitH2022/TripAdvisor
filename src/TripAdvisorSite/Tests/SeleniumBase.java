package TripAdvisorSite.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SeleniumBase {

    public ChromeDriver seleniumInit(String url){
            System.out.println("Starting...");
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--remote-allow-origins=*");    //fix for chrome version 111
            //Opening window tab in maximize mode
            options.addArguments("--start-maximized");
//            options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get(url);
            return driver;
        }
        public void seleniumClose (ChromeDriver driver) {

            driver.close();
        }


}
