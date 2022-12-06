package com.tutorialninja.testsuite;

import com.tutorialninja.pages.*;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    ComponentsPage componentsPage = new ComponentsPage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    HpProductPage hpProductPage = new HpProductPage();
    CartPage cartPage = new CartPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        loginPage.setClickOnMyAccount();
        registerPage.verifySelectMyAccountOptions("Register");
        registerPage.firstnameField("prime");
        registerPage.lastNameField("testing");
        registerPage.setEmail("sviradiya148@gmail.com");
        registerPage.setTelephone("07845613485");
        registerPage.setPassword("test145");
        registerPage.confirmPassword("test145");
        registerPage.setRadioButton();
        registerPage.agreeButtonClick();
        registerPage.setContinueButton();
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(registerPage.verifyAccountCreated(),expectedMessage,"");
        registerPage.continueText();
        registerPage.ClickOnMyAccount();
        registerPage.verifySelectMyLogOutOptions("Logout");
        registerPage.continueText();
        String expectedMessages = "Account Logout";
        Assert.assertEquals(registerPage.verifyAccountCreated(),expectedMessages,"");




    }


}
