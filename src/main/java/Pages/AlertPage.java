package Pages;

import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver){
        super(driver);    //  Przekazanie WebDrivera do konstruktora klasy nadrzędnej (BasePage), konstruktor który przkazuje referencję do klasy wyższej
    }

    public void openAlertPage(){
        openPage("https://letcode.in/alert");
    }

}
