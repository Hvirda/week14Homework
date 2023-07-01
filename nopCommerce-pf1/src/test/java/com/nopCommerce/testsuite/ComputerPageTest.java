package com.nopCommerce.testsuite;

import com.nopCommerce.pages.ComputerPage;
import com.nopCommerce.pages.HomePage;
import com.nopCommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    HomePage homepage;
    ComputerPage computerPage;



    @BeforeMethod
    public void inIt() {
        homepage = new HomePage();
        computerPage=new ComputerPage();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homepage.clickOnComputerLink();
        computerPage.clickOnDesktop();
        computerPage.selectAtoZ("Name: A to Z");

        computerPage.addtoCart();
         computerPage.getItemText();
           System.out.println( computerPage.getItemText());
        String actualText=computerPage.getItemText();
        String expectedText="Build your own computer";
        Assert.assertEquals(actualText,expectedText);
        computerPage.selectProcesser("2.2 GHz Intel Pentium Dual-Core E2200");
        computerPage.selectRam("8GB [+$60.00]");
        computerPage.selectRadiobtn();
        computerPage.selectCheckbox();
        computerPage.getPrice();
        computerPage.clickAddBtn();
        // computerPage.getMsg();
        //System.out.println(computerPage.getMsg());
        String actualmsg=computerPage.getMsg();
        String expectedmsg="The product has been added to your shopping cart";
        Assert.assertEquals(actualmsg,expectedmsg);
        computerPage.closemsg();
        computerPage.shoppingCart();
        computerPage.clickGoTo();
        //  computerPage.shoppingCartMsg();
        // System.out.println( computerPage.shoppingCartMsg());
        String actualmsg2=computerPage.shoppingCartMsg();
        String expectedmsg2="Shopping cart";
        Assert.assertEquals(actualmsg2,expectedmsg2);
        computerPage.changeQty();
        computerPage.clickOnUpdate();
        //  computerPage.getTotlal();
        // System.out.println(  computerPage.getTotlal());
        String actualTotal=computerPage.getTotlal();
        String expectedTotal="$2,930.00";
        Assert.assertEquals(actualTotal,expectedTotal);
        computerPage.clickTerms();
        computerPage.checkout();
        computerPage.clickGuestCheckout();

        computerPage.getFname("abc");
        computerPage.getlname("dsa");
        computerPage.getEmail("asd@gf.bnm");
        computerPage.getCountry("Canada");
        computerPage.getState("Ontario");
        computerPage.getCity("London");
        computerPage.getAddress("asdbvc");
        computerPage.getZipcode("dg56hg");
        computerPage.getPhoneNumber("77");
        computerPage.clickContinue();
        computerPage.clkradioair();
        computerPage.clkcontinue();
        computerPage.cliktCrediCard();
        // computerPage.getcredittxt();
        //System.out.println( computerPage.getcredittxt());
        String actualcredit= computerPage.getcredittxt();
        String expectedCredit="Credit Card";
        Assert.assertEquals(actualcredit,expectedCredit);
        computerPage.clickCont();
        computerPage.getCardHoldr("abgf");
        computerPage.getCardNo("374245455400126");
        computerPage.getExpMonth("09");
        computerPage.getExpYear("2024");
        computerPage.getcardcode("4321");
        computerPage.clkcontn();
        computerPage.gettotlamt();
        computerPage.clkcon();
        //computerPage.getSuccessfullorderMsg();
        // System.out.println(  computerPage.getSuccessfullorderMsg());
        String actualordermsg=  computerPage.getSuccessfullorderMsg();
        String expectedordermsg="Your order has been successfully processed!";
        Assert.assertEquals(actualordermsg,expectedordermsg);
        computerPage.cliccon();
        //   computerPage.getwelcmmsg();
        // System.out.println(computerPage.getwelcmmsg());
        String actualmsgl=computerPage.getwelcmmsg();
        String expectedmsgl="Welcome to our store";
        Assert.assertEquals(actualmsgl,expectedmsgl);



    }

    @Test
    public void verifyUserShouldclickonelectronics(){
        homepage.clickOnElectronics();

    }
}