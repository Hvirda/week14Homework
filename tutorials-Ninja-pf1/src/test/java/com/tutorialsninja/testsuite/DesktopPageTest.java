package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DesktopPageTest extends TestBase {

    HomePage homepage;
    DesktopPage desktopPage;


    @BeforeMethod
    public void inIt() {
        homepage=new HomePage();

       desktopPage=new DesktopPage();
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homepage.clickOnDesktop();
        homepage.getTextDesktop();
        String actualTxt= homepage.getTextDesktop();
        String expectedTxt="Desktops";
        Assert.assertEquals(actualTxt,expectedTxt);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homepage.clickOnDesktop();
        homepage.getTextDesktop();
        desktopPage.setSortZtoA("Name (Z - A)");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        homepage.clickOnDesktop();
        homepage.getTextDesktop();
        desktopPage.setSortAtoZ("Name (A - Z)");
        desktopPage.clkItem();
        // System.out.println(desktopPage.getItemTxt());
        // Verify the Text "HP LP3065"
        String actualtxt=desktopPage.getItemTxt();
        String expectedtxt="HP LP3065";
        Assert.assertEquals(actualtxt,expectedtxt);
        desktopPage.clkCalender();
        desktopPage.selectDate();
        desktopPage.addToCartBtn();
        //  desktopPage.getitemaddedmsg();
        //  System.out.println(desktopPage.getitemaddedmsg());
        String actualMsg=desktopPage.getitemaddedmsg();
        String expectedMsg="Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualMsg,expectedMsg);
        desktopPage.clkShoppinngCart();
        desktopPage.getProductName();
        String actualMsg1=desktopPage.getProductName();
        //  System.out.println(desktopPage.getProductName());
        String expectedMsg1="HP LP3065";
        Assert.assertEquals(actualMsg1,expectedMsg1);
        desktopPage.getTotal();
          System.out.println( desktopPage.getTotal());
        String actualMsg2=desktopPage.getTotal();
        String expectedMsg2="";
        Assert.assertEquals(actualMsg2,expectedMsg2);
    }
}
