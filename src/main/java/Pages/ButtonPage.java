package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

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

    public String findColor(){
        WebElement whatIsColor = driver.findElement(By.id("color"));
       return whatIsColor.getCssValue("background-color");
    }

    // Wartość rozmiaru jest obeiktem klasy Dimension
    public Dimension findSize(){
        WebElement whatIsSize = driver.findElement(By.id("property"));
        return whatIsSize.getSize();
    }

    public boolean buttonIsEnabled() {
       return disabledField("isDisabled");

    }

    public void holdButton(){
        WebElement clickHoldButton = driver.findElement(By.xpath("//button[.//h2[text()='Button Hold!']]"));


        Actions actions = new Actions(driver);  // Tworzenie obiektu Actions
        actions.clickAndHold(clickHoldButton).perform();
        // Aby wykonać przytrzymanie, należy skorzystać z Actions.clickAndHold().
        // Wywołanie .perform() jest wymagane, aby zainicjować akcję.
    }

}
