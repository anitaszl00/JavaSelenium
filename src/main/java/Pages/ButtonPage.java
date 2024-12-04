package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonPage extends BasePage{

    public ButtonPage(WebDriver driver){
        super(driver);    //  Przekazanie WebDrivera do konstruktora klasy nadrzędnej (BasePage)
    }

    public void openEditPage() {
        openPage("https://letcode.in/buttons"); // Wywołanie metody z BasePage
    }

    public void click(){
        WebElement goToHome = driver.findElement(By.id("home"));
        goToHome.click();
    }

    public void comeBack(){
        driver.navigate().back();
    }

    //Wartość lokalizacji jest obiektem klasy Point
    public Point findLocation(){
        WebElement findLocationButton = driver.findElement(By.id("position"));
        return findLocationButton.getLocation();
    }


}
