package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

 @CacheLookup
   @FindBy (xpath = "//input[@name='username']")
    WebElement username;

    @CacheLookup
    @FindBy (xpath = "//input[@name='password']")
    WebElement password;

    @CacheLookup
    @FindBy (xpath = "//button[@type='submit']")
    WebElement loginbtn;

    @CacheLookup
    @FindBy (xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashbordText;

    public void enterUsername(String uname){
        log.info("enter username"+username.toString()+"<br>");
        sendTextToElement(username,uname);
    }
    public void enterPassword(String pwd){
        log.info("enter username"+password.toString()+"<br>");
        sendTextToElement(password,pwd);
    }

    public void clickOnLoginBtn(){
        clickOnElement(loginbtn);
    }


}
