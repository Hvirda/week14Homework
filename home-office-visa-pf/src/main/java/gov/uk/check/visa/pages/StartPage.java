package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='js-confirmation-buttons govuk-button-group']/button[1]")
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(css = "a[class='gem-c-button govuk-button govuk-button--start']")
    WebElement startbtn;

    public void clkCookies(){
        clickOnElement(acceptCookie);
    }
    public void clkstart(){
        log.info("click startbtn "+startbtn+"<br>");
        clickOnElement(startbtn);
    }

}
