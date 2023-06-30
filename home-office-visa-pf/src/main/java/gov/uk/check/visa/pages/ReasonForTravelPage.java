package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForTravelList;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continu;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement welcmtxt;
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement selectWork;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement selectJob1;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement welcmMsg;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement selectJoin;


    public String getTxt(){
       log.info("navigation message "+welcmtxt.toString()+"<br>");
        return   getTextFromElement(welcmtxt);
    }
    public void clkWork(){
        log.info("select work from list "+selectWork.toString()+"<br>");
        clickOnElement(selectWork);
    }
    public void selectJob(){
        log.info("select job "+selectJob1.toString()+"<br>");
        clickOnElement(selectJob1);
    }
    public String getWelcmMsg(){
        log.info("welcome message "+welcmMsg.toString()+"<br>");
        return getTextFromElement(welcmMsg);
    }
    public void selectJoinFamily(){
        clickOnElement(selectJoin);
    }

    public void selectReasonForVisit(String reason){
        log.info("reson for traveling "+reasonForTravelList+"<br>");
        clickOnElement(reasonForTravelList);
    }
    public void clkContinue(){
        log.info("continue btn "+continu+"<br>");
        clickOnElement(continu);
    }

}
