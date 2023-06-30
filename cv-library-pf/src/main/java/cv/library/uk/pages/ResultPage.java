package cv.library.uk.pages;

import cv.library.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
            @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultTxt;

    public String getResultText(){
        log.info("get resulttext "+resultTxt+"<br>");
        return getTextFromElement(resultTxt);
    }
    public void verifyResult(String expected){

        String actualTxt=getResultText();
        Assert.assertTrue(actualTxt.equalsIgnoreCase(expected));
        log.info("actualtext "+actualTxt+"<br>");
    }
}
