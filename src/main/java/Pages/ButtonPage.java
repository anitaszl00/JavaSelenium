package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage extends BasePage{

    private final By goToHome = By.id("home");
    private final By findLocationButton = By.id("position");
    private final By whatIsColor = By.id("color");
    private final By whatIsSize = By.id("property");
    private final By clickHoldButton = By.xpath("//button[.//h2[text()='Button Hold!']]");


    public ButtonPage(WebDriver driver){
        super(driver);    //  Przekazanie WebDrivera do konstruktora klasy nadrzędnej (BasePage), konstruktor który przkazuje referencję do klasy wyższej
    }

    public void openEditPage() {

        openPage("https://letcode.in/buttons"); // Wywołanie metody z BasePage
    }

    public void click(){
        waitForElement(goToHome,10);
        findElement(goToHome).click();
    }



    public void comeBack(){
        driver.navigate().back();
    }

    //Wartość lokalizacji jest obiektem klasy Point
    public Point findLocation(){
       return driver.findElement(findLocationButton).getLocation();
    }

    public String findColor(){
       return driver.findElement(whatIsColor).getCssValue("background-color");
    }

    // Wartość rozmiaru jest obiektem klasy Dimension
    public Dimension findSize(){
        return driver.findElement(whatIsSize).getSize();
    }

    public boolean buttonIsEnabled() {
       return disabledField(By.id("isDisabled"));

    }

    public void holdButton(){
        WebElement button = driver.findElement(clickHoldButton);


        Actions actions = new Actions(driver);  // Tworzenie obiektu Actions
        actions.clickAndHold(button).perform();
        // Aby wykonać przytrzymanie, należy skorzystać z Actions.clickAndHold().
        // Wywołanie .perform() jest wymagane, aby zainicjować akcję.
    }

}
