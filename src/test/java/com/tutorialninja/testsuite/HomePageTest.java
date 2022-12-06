package com.tutorialninja.testsuite;

import com.tutorialninja.pages.ComponentsPage;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.LaptopAndNoteBookPage;
import com.tutorialninja.testbase.BaseTest;
import junit.framework.Assert;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    ComponentsPage componentsPage=new ComponentsPage();
    DesktopPage desktopPage=new DesktopPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage=new LaptopAndNoteBookPage();

    @Test

    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        desktopPage.userMouseHoverOnDesktopPage();
        String expectedText = "Desktops";
        desktopPage.selectMenu("Show All Desktops");
        Assert.assertEquals(desktopPage.userVerifyDesktopsText(), expectedText, "Not Navigate to DesktopPage");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        laptopAndNoteBookPage.userShouldMouseHoverOnLaptopAndBookPageTest();
        laptopAndNoteBookPage.selectMenu("Show all laptops & Notebooks");
        String expectedMessage="Laptops @ Notebooks";
        Assert.assertEquals(laptopAndNoteBookPage.verifyNoteBookAndLaptop(),expectedMessage,"no message displayed");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        componentsPage.userMouseHoverOnComponent();
        componentsPage.selectMenu("Show all components");
        String expectedMessage="Components";
        Assert.assertEquals(componentsPage.userVerifyComponentText(),expectedMessage,"No Element Found");
    }
}
