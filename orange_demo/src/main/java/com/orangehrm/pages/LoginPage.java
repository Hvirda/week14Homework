package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement registerFirstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement registerLastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement registerEmailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement registerPasswordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement registerCPasswordField;


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String email, String password) {
        enterEmailId(email);
        enterPassword(password);
        clickOnLoginButton();
    }

    public void register(String fName, String lName, String email,String pass, String cpass) throws InterruptedException {
        sendTextToElement(registerFirstNameField,fName);
        Thread.sleep(2000);
        sendTextToElement(registerLastNameField,lName);
        Thread.sleep(2000);
        sendTextToElement(registerEmailField,email);
        Thread.sleep(2000);
        sendTextToElement(registerPasswordField,pass);
        Thread.sleep(2000);
        sendTextToElement(registerCPasswordField,cpass);
        Thread.sleep(2000);
        clickOnElement(registerButton);
    }

}
