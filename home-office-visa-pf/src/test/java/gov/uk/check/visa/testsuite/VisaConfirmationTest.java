package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    DurationOfStayPage durationOfStayPage;
    NationalityPage nationalityPage;
    FamilyImigrationPage familyImigrationPage;
    ReasonForTravelPage reasonForTravelPage;
    @BeforeMethod
    public void inIt() {
        startPage=new StartPage();
        durationOfStayPage=new DurationOfStayPage();
        familyImigrationPage=new FamilyImigrationPage();
        reasonForTravelPage=new ReasonForTravelPage();
        nationalityPage=new NationalityPage();

    }

     @Test(priority = 2)
    public void anAustralianCominToUKForTourism(){
        startPage.clkCookies();
        startPage.clkstart();
        nationalityPage.selectNationality("Australia");
        nationalityPage.clkContinue();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clkContinue();
        String actualtxt=reasonForTravelPage.getTxt();
        System.out.println(actualtxt);
        String expected="You will not need a visa to come to the UK";
        Assert.assertEquals(actualtxt,expected);
    }
    @Test(priority = 1)
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clkCookies();
        startPage.clkstart();
        nationalityPage.selectNationality("Chile");
        nationalityPage.clkContinue();
        reasonForTravelPage.clkWork();
        reasonForTravelPage.clkContinue();
        durationOfStayPage.selectLengthOfStay("morethan6Month");
        durationOfStayPage.clkContinue();
        reasonForTravelPage.selectJob();
        durationOfStayPage.clkContinue();

        //verify  result 'You need a visa to work in health and care'
        String actualMsg=reasonForTravelPage.getWelcmMsg();
       // System.out.println(actualMsg);
        String expectedMsg="You need a visa to work in health and care";
        Assert.assertEquals(actualMsg,expectedMsg);

    }
    @Test(priority = 3)
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clkCookies();
        startPage.clkstart();
        nationalityPage.selectNationality("India");
        nationalityPage.clkContinue();
        reasonForTravelPage.selectJoinFamily();
        reasonForTravelPage.clkContinue();
        familyImigrationPage.selectImmigrationStatus("yes");
        familyImigrationPage.clkFamilyContinue();

        //verify You’ll need a visa to join your family or partner in the UK' message
        String actualResult=reasonForTravelPage.getWelcmMsg();
        String expectedResult="You’ll need a visa to join your family or partner in the UK";
        Assert.assertEquals(actualResult,expectedResult);

    }




}
