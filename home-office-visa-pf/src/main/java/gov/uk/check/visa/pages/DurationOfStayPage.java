package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }
   @CacheLookup
    @FindBy(id = "response-0")
    WebElement sixMonth;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonth;


    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")

    WebElement continu;


    public void clkOnSixMonth(){
       log.info("6 months"+sixMonth.toString()+"<br>");
        clickOnElement(sixMonth);
    }
    public void clkOnMoreThanSixMnth(){
        log.info("more than 6 months"+moreThanSixMonth.toString()+"<br>");
        clickOnElement(moreThanSixMonth);
    }
    public void clkContinue(){

        clickOnElement(continu);
    }

    public void  selectLengthOfStay(String moreOrLess){
        String s1=sixMonth.toString();
        String s2=moreThanSixMonth.toString();
        switch (moreOrLess){
            case "6Month":
                s1.equals(moreOrLess);
                clkOnSixMonth();
                break;
            case "morethan6Month":
                s2.equals(moreOrLess);
                clkOnMoreThanSixMnth();
                break;

        }
    }

}
