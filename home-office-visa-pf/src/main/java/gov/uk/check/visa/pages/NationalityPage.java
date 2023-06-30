package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(NationalityPage.class.getName());

    public NationalityPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationality;
    @CacheLookup
    @FindBy(xpath ="//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continuebtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='govuk-caption-l']")
    WebElement resultTxt;





        public void selectNationality(String nation){
            log.info("naionality"+nationality.toString()+"<br>");
            selectByVisibleTextFromDropDown(nationality,nation);
        }
        public void clkContinue(){

            log.info("click continue"+continuebtn.toString()+"<br>");clickOnElement(continuebtn);
        }

    public String getResultTxt(){
        log.info("result text "+resultTxt.toString()+"<br>");
        return getTextFromElement(resultTxt);
    }
    public void confirmMsg(String expectedMsg){
        log.info("Message "+expectedMsg.toString()+"<br>");
        String actualMsg=getResultTxt();
        Assert.assertTrue(actualMsg.equalsIgnoreCase(expectedMsg));
    }



}
