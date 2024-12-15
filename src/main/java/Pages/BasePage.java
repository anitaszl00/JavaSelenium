package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver; //  pole WebDrivera referencja


    // Konstruktor przyjmujący WebDriver
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //otwarcie strony
    public void openPage(String url){
        driver.get(url);
    }

   //  sprawdzenie czy element jest dostępny
    public boolean disabledField(By locator) {
        return findElement(locator).isEnabled();
    }

    // wyszukiwanie elementu
    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    // czekanie na element
    protected WebElement waitForElement(By locator, int timeout){
    return new WebDriverWait(driver, Duration.ofSeconds(timeout))
        .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
