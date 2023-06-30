package cv.library.uk.testsuite;

import cv.library.uk.pages.HomePage;
import cv.library.uk.pages.ResultPage;
import cv.library.uk.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage=new ResultPage();

    }

    @Test(dataProvider = "resultData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result) throws InterruptedException {

       homePage.iframeHandle();
        homePage.enterJobTitle(jobTitle);
        homePage.setLocation(location);
        homePage.setSelectMile(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.minSalary(salaryMin);
        homePage.maxSalary(salaryMax);
        homePage.setsalaryType(salaryType);
        homePage.setJobType(jobType);
        homePage.clkFind();
        resultPage.getResultText();
        resultPage.verifyResult(result);
    }
}