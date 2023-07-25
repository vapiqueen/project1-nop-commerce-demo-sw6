package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
       new HomePage().clickOnLoginLink();
    }

    @Then("I should be able to verify that {string} message is displayed")
    public void iShouldBeAbleToVerifyThatMessageIsDisplayed() {
        Assert.assertEquals(new LoginPage().verifyWelcomeText(),"Welcome, Please Sign In!","Message not visible");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {

        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Message not visible");
    }


    @Then("I should logout link displayed")
    public void iShouldLogoutLinkDisplayed() {
        Assert.assertEquals(new LoginPage().verifyLogoutLinkIsDisplayed(),"Logout link should be displayed", "Logout link not visible");
    }


    @Then("I should see login link displayed")
    public void iShouldSeeLoginLinkDisplayed() {
        Assert.assertEquals(new LoginPage().verifyLoginLinkIsDisplayed(),"LogIn link should be displayed", "LogIn link not visible");
    }
}
