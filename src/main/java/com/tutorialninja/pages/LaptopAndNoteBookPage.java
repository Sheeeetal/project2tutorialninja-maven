package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaptopAndNoteBookPage extends Utility {
    By mouseHoverOnLaptopAndBookPage = By.linkText("Laptops & Notebooks");

    public void userShouldMouseHoverOnLaptopAndBookPageTest() {
        mouseHoverToElementAndClick(mouseHoverOnLaptopAndBookPage);
    }

    By verifyLaptopAndNoteBookPageTestText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    public String verifyNoteBookAndLaptop() {
        return getTextFromElement(verifyLaptopAndNoteBookPageTestText);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*\""));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();

                }
            }

        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("\"//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));

        }

    }
}

