package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImigrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImigrationPage.class.getName());

    public FamilyImigrationPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement statusYes;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement statusNo;

  @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continu;


    public void clkYes(){
        log.info("click on yes "+statusYes+"<br>");
        clickOnElement(statusYes);
    }
    public void clkNo(){
        log.info("click on no "+statusNo+"<br>");
        clickOnElement(statusNo);
    }
    public void clkFamilyContinue(){
        log.info("click on continue "+continu+"<br>");
        clickOnElement(continu);
    }

    public void selectImmigrationStatus(String status){
        String s1=statusYes.toString();
        String s2=statusNo.toString();
        switch (status){
            case "yes":
                s1.equals(status);
                clkYes();
                break;
            case "no":
                s2.equals(status);
                clkNo();
                break;

        }
    }

}
