package com.parabank.testsuite;

import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage register;

    @BeforeMethod
    public void inIt() {
       register = new RegisterPage();
           }
           @Test(priority = 1)
    public void verifyThatSigningUpPageDisplay(){
         register.clickOnRegisterLink();
               register.getfName("abc");
               register.getlName("dsa");
               register.getaddress("asdfgh");
               register.getCity("asdfgh");
               register.getState("asfgdf");
               register.getZipcode("ha67tsa");
               register.getPhoneNumber("7756435678");
               register.getSSN("223");
               register.getusername("DDK");
               register.getpwd("DDD@123");
               register.getrepeatpwd("DDD@123");
               register.clicksubmit();
               register.getuname("DDK");
               register.getPaswrd("DDD@123");
               register.login();
    }
    @Test(priority = 2)
    public void verifyUserShouldNavigateToRegisterPage() {
        register.clickOnRegisterLink();
        String actual= register.getWelcomeText();
        String expected="Customer Login";
        Assert.assertEquals(actual,expected);
        System.out.println(register.getWelcomeText());



    }
}
