package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage {

    private final By selectFruit = By.id("fruits");
    private final By successNotification = By.xpath("//div[contains(@class, 'notification') and contains(@class, 'is-success')]//p[@class='subtitle']");
    private final By successHeroNotification = By.xpath("//p[text()='You have selected Batwoman']");
    private final By superHero = By.id("superheros");
    private final By programmingLanguage = By.id("lang");
    private final By selectCountry = By.id("country");

    public DropdownPage(WebDriver driver){
        super(driver);
    }


    public void openDropDownPage() {
        openPage("https://letcode.in/dropdowns");
    }

    public void selectFruit(String fruitName){
        waitForElement(selectFruit, 10);
        Select objSelect = new Select(findElement(selectFruit));
        objSelect.selectByVisibleText(fruitName);
    }

    public String getNotification(){
        waitForElement(successNotification,10);
        return getElementText(successNotification);
    }

    public boolean isMultipleCheck(){
        Select objSelect = new Select(findElement(superHero));
        return objSelect.isMultiple();
    }

    public void selectSuperHero(){
        Select objSelect = new Select(findElement(superHero));
        objSelect.selectByIndex(4);
    }

    public String getHeroNotification(){
        waitForElement(successHeroNotification, 10);
        return getElementText(successHeroNotification);
    }


    public List<String> checkFruits() {
        Select objSelect = new Select(findElement(selectFruit));
        List<WebElement> fruitsElements = objSelect.getOptions();

        List<String> actualFruits = fruitsElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        return actualFruits;
    }

public void selectLanguage(){
        Select objSelect = new Select(findElement(programmingLanguage)); // tworzę obiekt select

        List<WebElement> options = objSelect.getOptions(); //pobieram wszystkie języki

        int lastLanguage = options.size() - 1; // Znajduję ostatni język
        objSelect.selectByIndex(lastLanguage); //wybieram ostatni indeks

        for (WebElement option: options) {
            System.out.println(option.getText());
        }

}

public List<String> checkLanguae(){
        Select objSelect = new Select(findElement(programmingLanguage));
        List<WebElement> languageOptions = objSelect.getOptions();

        List<String> actualLanguage = languageOptions.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return actualLanguage;

    }
public String selectCountry(){
        Select objSelect = new Select(findElement(selectCountry)); // tworzę obiek select
        objSelect.selectByValue("India"); // wybieram opcję

        WebElement selectedCountry = objSelect.getFirstSelectedOption(); // pobranie opcji
        String selectedCountryText = selectedCountry.getText(); //pobranie tekstu

    System.out.println("Wybrałeś: " + selectedCountryText);
    return selectedCountryText;



}

}
