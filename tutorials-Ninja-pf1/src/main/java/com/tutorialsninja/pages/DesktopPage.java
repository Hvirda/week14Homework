package com.tutorialsninja.pages;

import com.tutorialsninja.driverfactory.ManageDriver;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortZtoA;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortAtoZ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement itemTxt;

    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement item;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']/i[@class='fa fa-calendar']")
    WebElement calender;

    @CacheLookup
    @FindBy(xpath = "//tr/th[@class='picker-switch']")
    WebElement monthYear;

    @CacheLookup
    @FindBy(xpath = "//th[@class='next']")
    WebElement next;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addbtn;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addedText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[contains(text(),'shopping cart')]")
    WebElement shoppingTxt;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement shoppingMsg;


    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//li/table/tbody/tr/td[5]")
    WebElement total;


    public void setSortZtoA(String name){
        log.info("sort z to a" +sortZtoA.toString()+"<br>");
        selectByVisibleTextFromDropDown(sortZtoA,name);
    }

    public void setSortAtoZ(String name){
        log.info("sort a to z" +sortAtoZ.toString()+"<br>");
        selectByVisibleTextFromDropDown(sortAtoZ,name);
    }
    // Verify the Text "HP LP3065"
    public void clkItem(){
        clickOnElement(item);
    }
    public String getItemTxt(){
        log.info("item text " +itemTxt.toString()+"<br>");
        return getTextFromElement(itemTxt);
    }
    //click on calender
    public void clkCalender(){
        clickOnElement(calender);
    }
    public void selectDate() {
        String day = "22";
        String month = "November";
        String year = "2013";
        while (true) {
            //get default month and year

            String monyear = getTextFromElement(monthYear);
            String arr[] = monyear.split(" ");
            String month1 = arr[0];
            String year1 = arr[1];

        if (month1.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
            Reporter.log("month and year " +monyear.toString()+"<br>");
            break;
        } else {
            //to click on next
            clickOnElement(next);

        }

    }


    }
    public void addToCartBtn(){
        clickOnElement(addbtn);
    }
    public String getitemaddedmsg(){
        log.info(addedText.toString()+"<br>");
        return getTextFromElement(addedText);
    }
    public void clkShoppinngCart(){
        clickOnElement(shoppingTxt);
    }
    public String getShoppingCartMsg(){
        log.info(shoppingMsg.toString()+"<br>");
        return getTextFromElement(shoppingMsg);
    }
    public String getProductName(){
        log.info("product name " +productName.toString()+"<br>");
        return getTextFromElement(productName);
    }
    public String getTotal(){
        log.info("Total " +total.toString()+"<br>");
        return getTextFromElement(total);
    }

}
