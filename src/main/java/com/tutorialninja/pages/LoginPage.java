package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By clickOnMyAccount= By.xpath("//span[contains(text(),'My Account')]");
    By MyAccountOptions=By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By VerifyReturnAccountText=By.xpath("//h2[contains(text(),'Returning Customer')]\");\n");

     public void setClickOnMyAccount(){
         clickOnElement(clickOnMyAccount);
     }
     public void verifySelectMyAccountOptions(String options){
         selectMyAccountOptions(MyAccountOptions,options);
     }
     public String verifyReturningCustomerAccountMessage(){
         return getTextFromElement(VerifyReturnAccountText);
     }
}
