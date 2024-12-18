package com.test;

import Pages.InputPage;
import org.junit.Assert;
import org.junit.Test;


public class InputTest extends BaseTest{

    @Test
    public void inputTest(){


// Tworzenie obiektu InputPage z WebDriverem
        InputPage inputPage = new InputPage(driver);
        inputPage.openEditPage();

        String expectedFullName = "Jan Kowalski";
        inputPage.fillFullName(expectedFullName);
        String actualFullName = inputPage.getFullName();

        Assert.assertEquals("Tekst w polu Enter your full Name nie zgadza się", expectedFullName, actualFullName);


        inputPage.keyboardTab();

        inputPage.getAttribute();
        inputPage.clear();

        String clearedValue = inputPage.getClearTheText();

        Assert.assertEquals("Pole nie zostało wyczyszczone", "", clearedValue);

        inputPage.confirmButton();

        Assert.assertFalse("Pole powinno być wyłączone", inputPage.confirmButton());
        System.out.println("Pole jest nieaktywne");

        inputPage.readOnly();
        Assert.assertTrue("To pole powinno być readonly", inputPage.readOnly());
        System.out.println("Pole jest tylko do odczytu");

    }

}
