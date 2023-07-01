package com.tutorialsninja.pages;

import com.tutorialsninja.driverfactory.ManageDriver;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "My Account")
    WebElement myAccount;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    @CacheLookup
    @FindBy(xpath= "//div[@id='content']/h1")
    WebElement registerTxt;

    @CacheLookup
    @FindBy(id= "input-firstname")
    WebElement fname;

@CacheLookup
@FindBy(id= "input-lastname")
WebElement lname;
    @CacheLookup
    @FindBy(id= "input-telephone")
    WebElement tphone;

    @CacheLookup
    @FindBy(id= "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id= "input-password")
    WebElement pwd;

    @CacheLookup
    @FindBy(id= "input-confirm")
    WebElement cpwd;

    @CacheLookup
    @FindBy(xpath= "//div/label[1]/input[@name='newsletter']")
    WebElement radio;

    @CacheLookup
    @FindBy(xpath= "//div/input[@type='checkbox']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(xpath= "//div/input[2]")
    WebElement con;

    @CacheLookup
    @FindBy(xpath= "//div[@id='content']/h1")
    WebElement msg;

    @CacheLookup
    @FindBy(linkText= "Continue")
    WebElement cntn;

    @CacheLookup
    @FindBy(linkText= "My Account")
    WebElement myAccnt;

    @CacheLookup
    @FindBy(linkText= "Logout")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath= "//div[@id='content']/h1")
    WebElement logoutMsg;

    @CacheLookup
    @FindBy(linkText= "Continue")
    WebElement contnu;







    public void clkMyAccount(){
        log.info("my account"+myAccount.toString()+"<br>");
        clickOnElement(myAccount);
    }
    public void clkRegister(){
        log.info("register "+register.toString()+"<br>");
        clickOnElement(register);
    }
    public String getRegisterText(){
        log.info("verify register text "+registerTxt.toString()+"<br>");
        return getTextFromElement(registerTxt);
    }
    public void getfname(String name){
        log.info("firstname" +fname.toString()+"<br>");
        sendTextToElement(fname,name);
    }

    public void getlname(String name) {
        log.info("lastname" +lname.toString()+"<br>");
        sendTextToElement(lname,name);
    }

    public void getEmail(String name) {
        log.info("email " +email.toString()+"<br>");
        sendTextToElement(email,name);
    }

    public void getTphone(String no) {
        log.info("Telephone" +tphone.toString()+"<br>");
    sendTextToElement(tphone,no);
    }

    public void getpwd(String name) {
        log.info("password" +pwd.toString()+"<br>");
        sendTextToElement(pwd,name);
    }

    public void getcpwd(String name) {
        log.info("cpwd" +cpwd.toString()+"<br>");
        sendTextToElement(cpwd,name);
    }

    public void getRadio(){
        log.info("Radio" +radio.toString()+"<br>");
        clickOnElement(radio);
    }

    public void clkCheckbx() {
        log.info("checkbox" +checkbox.toString()+"<br>");
        clickOnElement(checkbox);
    }

    public void clkcon() {
        log.info("continue " +con.toString()+"<br>");
        clickOnElement(con);
    }
    //verify account created msg

    public String getMsg() {
        log.info("message " +msg.toString()+"<br>");
        return getTextFromElement(msg);
    }

    public void clkContn() {
    clickOnElement(cntn);
    }

    public void clkMyAccnt() {
        log.info("myAccount" +myAccnt.toString()+"<br>");
        clickOnElement(myAccnt);
    }

    public void clkLogout(){
        log.info("logout " +logout.toString()+"<br>");
        clickOnElement(logout);
    }

    //verify logout msg
    public String getLogoutMsg(){
        log.info("logout " +logoutMsg.toString()+"<br>");
        return getTextFromElement(logoutMsg);
    }

    public void clkContnu(){
        clickOnElement(contnu);
    }



}
