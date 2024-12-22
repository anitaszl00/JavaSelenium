package com.test;

import Pages.DropdownPage;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class DropdownTest extends BaseTest{

    @Test

    public void dropDownTest(){
        DropdownPage dropdownPage = new DropdownPage(driver);

        dropdownPage.openDropDownPage();
        dropdownPage.selectFruit("Apple");
        Assert.assertEquals("You have selected Apple", dropdownPage.getNotification());

        dropdownPage.isMultipleCheck();
        Assert.assertTrue("To nie jest wielokrotny wybór", dropdownPage.isMultipleCheck());
        System.out.println("To jest wielokrotny wybór");

        dropdownPage.selectSuperHero();
        Assert.assertEquals("You have selected Batwoman", dropdownPage.getHeroNotification());

        dropdownPage.checkFruits();
        List<String> expectedFruits = List.of("Select Fruit", "Apple", "Mango", "Orange", "Banana", "Pine Apple");
        List<String> actualFruits = dropdownPage.checkFruits();
        Assert.assertEquals("Lista owoców jest inna", expectedFruits, actualFruits);


        dropdownPage.selectLanguage();
        List<String> expectedLanguage = List.of("JavaScript", "Java", "Python", "Swift", "C#");
        List<String> acturalLanguage = dropdownPage.checkLanguae();
        Assert.assertEquals("Lista języków jest inna", expectedLanguage, acturalLanguage);

        String selectedCountry = dropdownPage.selectCountry();
        Assert.assertEquals("India", selectedCountry);


    }

}
