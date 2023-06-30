package cv.library.uk.pages;

import cv.library.uk.utility.Utility;
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
    }// error to come alert


    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement cookie;

    @CacheLookup
    @FindBy(xpath ="//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath ="//select[@id='distance']")
            WebElement selectMile;

    @CacheLookup
    @FindBy(css ="div.hp-search-more>#toggle-hp-search")
            WebElement moreSearch;
    @CacheLookup
    @FindBy(xpath ="//input[@id='salarymin']")
            WebElement minSalary;
    @CacheLookup
    @FindBy(xpath="//input[@id='salarymax']")
    WebElement maxSalary;

    @CacheLookup
    @FindBy(xpath="//select[@id='salarytype']")
    WebElement salarytype;

    @CacheLookup
    @FindBy(xpath="//select[@id='tempperm']")
            WebElement jobType;

    @CacheLookup
    @FindBy(xpath="//input[@id='hp-search-btn']")
            WebElement findJobs;

    @CacheLookup
    @FindBy(xpath="//h1")
            WebElement welcmText;




    public void iframeHandle() throws InterruptedException {

        driver.switchTo().frame("gdpr-consent-notice");
        cookie.click();
      //driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public void enterJobTitle(String job){
        sendTextToElement(jobTitle,job);
    }
    public void setLocation(String local) {
       log.info("location "+location.toString()+"<br>");
        sendTextToElement(location, local);
    }

    public void setSelectMile(String mile) {
        selectByVisibleTextFromDropDown(selectMile, mile);
    }
    public void  clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearch);
    }

    public void minSalary(String salary){
        log.info("min salary "+minSalary.toString()+"<br>");
        sendTextToElement(minSalary,salary);
    }
    public void maxSalary(String salary){
        log.info("max salary "+maxSalary.toString()+"<br>");
        sendTextToElement(maxSalary,salary);
    }
    public void setsalaryType(String type){
        log.info("salarytype "+salarytype.toString()+"<br>");
        selectByVisibleTextFromDropDown(salarytype,type);
    }
    public void setJobType(String jobtype){
        log.info("jobtype "+jobtype.toString()+"<br>");
        selectByVisibleTextFromDropDown(jobType,jobtype);
    }
    public void clkFind(){
        log.info("findjobs"+findJobs.toString()+"<br>");
        clickOnElement(findJobs);
    }
    public String getWelcmTxt(){
        log.info("welcome text"+welcmText.toString()+"<br>");
        return getTextFromElement(welcmText);
    }


}
/*



 */