package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver; //  pole WebDrivera

    // Konstruktor przyjmujący WebDriver
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

}
