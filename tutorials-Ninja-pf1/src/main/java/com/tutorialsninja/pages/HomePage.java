package com.tutorialsninja.pages;

import com.tutorialsninja.driverfactory.ManageDriver;
import com.tutorialsninja.utility.Utility;
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
    @FindBy(xpath = "//li[1]/a[@class='dropdown-toggle']")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//li[1]/div/a")
    WebElement allDesktoplink;
    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement welcmTxt;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dropdown-menu']/a[contains(text(),'Show AllLaptops & Notebooks')]")
    WebElement allLaptops;
    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement laptopTxt;


  public void clickOnDesktop() {
      log.info("mousehover desktop " +desktops.toString()+"<br>");
      mouseHoverToElement(desktops);
      clickOnElement(allDesktoplink);
  }
  public String getTextDesktop(){
      log.info("welcome text desktop " +welcmTxt.toString()+"<br>");
      return getTextFromElement(welcmTxt);
  }
  public void clkLaptopAndNotebook(){
      log.info("mousehover laptopandnotebook " +laptopsAndNotebooks.toString()+"<br>");
      mouseHoverToElement(laptopsAndNotebooks);
      clickOnElement(allLaptops);
  }
  public String getTextLaptop(){
      log.info("laptop text" +laptopTxt.toString()+"<br>");
      return getTextFromElement(laptopTxt);
  }

}
