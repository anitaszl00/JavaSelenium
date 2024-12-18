package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class InputPage extends BasePage {

    private final By enterFullName = By.id("fullName");
    private final By clickTab = By.id("join");
    private final By textBox = By.id("getMe");
    private final By clearTheText = By.id("clearMe");
    private final By dontWrite = By.id("dontwrite");


    public InputPage(WebDriver driver){
        super(driver);    //  Przekazanie WebDrivera do konstruktora klasy nadrzędnej (BasePage)
    }

public void openEditPage() {
    openPage("https://letcode.in/edit"); // Wywołanie metody z BasePage
}

    public void fillFullName(String fullName) {
        waitForElement(enterFullName, 10);
        driver.findElement(enterFullName).sendKeys(fullName);
    }

    public String getFullName(){
        WebElement fullNameField = findElement(enterFullName);
        return fullNameField.getAttribute("value");
    }

    public void keyboardTab() {
        driver.findElement(clickTab).sendKeys(Keys.TAB);
    }

    public void getAttribute() {
          WebElement insideTextbox = driver.findElement(textBox);
          String value = insideTextbox.getAttribute("value");
          System.out.println("Wartość to " + value);
    }

    public void clear() {
        driver.findElement(clearTheText).clear();
    }

    public String getClearTheText(){
        WebElement clearTheTextValue = findElement(clearTheText);
        return clearTheTextValue.getAttribute("value");
    }

    public boolean confirmButton() {
       return disabledField(By.id("noEdit"));

    }

    public boolean readOnly() {
        WebElement readOnlyText = driver.findElement(dontWrite);
        String readOnlyAttribute = readOnlyText.getAttribute("readonly");
        return readOnlyAttribute != null && readOnlyAttribute.equals("true");
    }


}
