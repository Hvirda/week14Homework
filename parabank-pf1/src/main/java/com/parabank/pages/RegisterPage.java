package com.parabank.pages;

import com.parabank.driverfactory.ManageDriver;
import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='loginPanel']/p[2]/a")
    WebElement registerLink;
    // By welcomeText = By.xpath("//h2");
    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement registerText;
    public String getWelcomeText() {

        log.info("get welcome text" +registerText.toString());
        return getTextFromElement(registerText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstName;
    public void getfName(String name) {
        log.info("Enter Firstname" +firstName.toString());
        sendTextToElement(firstName, name);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastName;
    //By address=By.xpath("");
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement address;
    //By city=By.xpath("/");
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement city;
    // By state=By.xpath("//input[@id='customer.address.state']");
    @CacheLookup
    @FindBy(xpath ="//input[@id='customer.address.state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath ="//input[@id='customer.address.zipCode']")
            WebElement zipcode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
            WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer.ssn']")
            WebElement ssn;
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.username']")
    WebElement username;
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath="//input[@id='repeatedPassword']")
    WebElement repeatpwd;
    @CacheLookup
    @FindBy(xpath="//div[3]/input[@class='button']")
    WebElement submit;

    @CacheLookup
    @FindBy(xpath="//div[1]/input[@class='input']")
    WebElement uname;

    @CacheLookup
    @FindBy(xpath="//div[2]/input[@class='input']")
    WebElement pwd;
    @CacheLookup
    @FindBy(xpath="//div/input[@class='button']")
    WebElement loginbtn;

    @CacheLookup
    @FindBy(xpath="//div[@id='leftPanel']//li[8]/a")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath="//div[@id='rightPanel']/p")
    WebElement welcommsg;
    public void clickOnRegisterLink() {
        log.info("click on register link :" + registerLink.toString());
        clickOnElement(registerLink);

    }
    public void getlName(String name) {
        log.info("Enter laststname" +name.toString());
        sendTextToElement(lastName, name);
    }
    public void getaddress(String name) {
       log.info("address " +name.toString());
        sendTextToElement(address, name);
    }
    public void getCity(String name) {
       log.info("city " +name.toString());
        sendTextToElement(city, name);
    }
    public void getState(String name) {
        log.info("state " +name.toString());
        sendTextToElement(state, name);
    }
    public void getZipcode(String name) {
       log.info("zipcode " +name.toString());
        sendTextToElement(zipcode, name);
    }

    public void getPhoneNumber(String name) {
        log.info("Enter Firstname" +name.toString());
        sendTextToElement(phoneNumber, name);
    }

    public void getSSN(String name) {
        log.info("Enter Firstname" +name.toString());
        sendTextToElement(ssn, name);
    }

    public void getusername(String name) {
        log.info("Enter Firstname" +name.toString());
        sendTextToElement(username, name);
    }
    public void getpwd(String name) {
       log.info("Enter Firstname" +name.toString());
        sendTextToElement(password, name);
    }

    public void getrepeatpwd(String name) {
        log.info("Enter Firstname" +name.toString());
        sendTextToElement(repeatpwd, name);
    }

    public void clicksubmit() {

        log.info(submit);
    }

    public String getwelcmmsg(){

        return getTextFromElement(welcommsg);
    }
    public void getuname(String name){
        log.info("enter uname"+name.toString());
        sendTextToElement(uname,name);
    }
    public  void getPaswrd(String name){
       log.info("enter uname"+name.toString());
        sendTextToElement(pwd,name);
    }
    public void login(){
        log.info(loginbtn);
    }
    public void logout(){
        clickOnElement(logout);
    }


}
