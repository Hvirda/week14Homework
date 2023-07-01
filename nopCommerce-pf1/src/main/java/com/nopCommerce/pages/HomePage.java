package com.nopCommerce.pages;

import com.nopCommerce.driverfactory.ManageDriver;
import com.nopCommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']/li[1]/a[@href='/computers']")
    WebElement computer;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']")
    WebElement electronics;



    public void clickOnComputerLink(){
       mouseHoverToElement(computer);
    }
    public void clickOnElectronics(){
        mouseHoverToElement(electronics);
    }




}
