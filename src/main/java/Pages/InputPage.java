package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class InputPage extends BasePage {

    public InputPage(WebDriver driver){
        super(driver);    //  Przekazanie WebDrivera do konstruktora klasy nadrzędnej (BasePage)
    }

public void openEditPage() {
    openPage("https://letcode.in/edit"); // Wywołanie metody z BasePage
}

    public void fillFullName(String fullName) {
        WebElement enterFullName = driver.findElement(By.id("fullName"));
        enterFullName.sendKeys(fullName);

    }

    public void keyboardTab() {
        driver.findElement(By.id("join")).sendKeys(Keys.TAB);
    }


    public void getAttribute() {
          WebElement textbox = driver.findElement(By.id("getMe"));
          String value = textbox.getAttribute("value");
          System.out.println("Wartość to " + value);

    }

    public void clear() {
        WebElement clearTheText = driver.findElement(By.id("clearMe"));
        clearTheText.clear();
    }


    public boolean disabledField() {
        WebElement disabledText = driver.findElement(By.id("noEdit"));
        return disabledText.isEnabled();
    }

    public boolean readOnly() {
        WebElement readOnlyText = driver.findElement(By.id("dontwrite"));
        String readOnlyAttribute = readOnlyText.getAttribute("readonly");
        return readOnlyAttribute != null && readOnlyAttribute.equals("true");
    }


}
