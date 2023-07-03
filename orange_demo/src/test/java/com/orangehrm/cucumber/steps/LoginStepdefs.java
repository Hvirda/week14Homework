package com.orangehrm.cucumber.steps;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepdefs {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
      new HomePage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
      new HomePage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginBtn();
    }

    @Then("^I should login successfully and see \"([^\"]*)\"$")
    public void iShouldLoginSuccessfullyAndSee(String text)  {
        Assert.assertEquals(text, new DashboardPage().verifyTxt(),"text doesnt match");

    }
}
