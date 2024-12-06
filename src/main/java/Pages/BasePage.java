package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver; //  pole WebDrivera

    // Konstruktor przyjmujący WebDriver
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //otwarcie strony
    public void openPage(String url){
        driver.get(url);
    }

    // sprawdzenie czy element jest dostępny
    public boolean disabledField(String id) {
        WebElement field = driver.findElement(By.id(id));
        return field.isEnabled();
    }

}
