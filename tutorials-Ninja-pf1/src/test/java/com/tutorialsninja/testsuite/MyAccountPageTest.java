package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageTest extends TestBase {
   MyAccountPage myAccountPage;

    @BeforeMethod
    public void inIt() {

       myAccountPage = new MyAccountPage();
           }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        myAccountPage.clkMyAccount();
        myAccountPage.clkRegister();
        myAccountPage.getRegisterText();
        System.out.println( myAccountPage.getRegisterText());
        String actual= myAccountPage.getRegisterText();
        String expected="Register Account";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccountPage.clkMyAccount();
        myAccountPage.clkRegister();
        myAccountPage.getfname("abc");
        myAccountPage.getlname("gfd");
        myAccountPage.getEmail("mnavc@gfd.com");
        myAccountPage.getTphone("7889342134");
        myAccountPage.getpwd("hh@123");
        myAccountPage.getcpwd("hh@123");
        myAccountPage.getRadio();
        myAccountPage.clkCheckbx();
        myAccountPage.clkcon();
        myAccountPage.getMsg();
        System.out.println( myAccountPage.getMsg());
        String actualMsg= myAccountPage.getMsg();
        String expectedMsg="Your Account Has Been Created!";
        Assert.assertEquals(actualMsg,expectedMsg);
        myAccountPage.clkContn();
        myAccountPage.clkMyAccnt();
        myAccountPage.clkLogout();
        myAccountPage.getLogoutMsg();
        System.out.println( myAccountPage.getLogoutMsg());
        String actuallgouMsg= myAccountPage.getLogoutMsg();
        String expectedlgoutMsg="Account Logout";
        Assert.assertEquals(actuallgouMsg,expectedlgoutMsg);
        myAccountPage.clkContnu();
    }
}
