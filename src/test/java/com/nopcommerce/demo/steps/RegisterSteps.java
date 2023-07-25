package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
      new HomePage().clickOnRegisterLink();
    }
    @Then("I should see the Registration link")
    public void iShouldSeeTheRegistrationLink() {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(),"Register" , "Registration text is not visible");
    }

    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {

        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameError(),"First name is required.","Error message is not visible");
        Assert.assertEquals(new RegisterPage().verifyLastNameError(),"Last name is required.","Error message is not visible");
        Assert.assertEquals(new RegisterPage().verifyEmailError(),"Email is required.","Error message is not visible");
        Assert.assertEquals(new RegisterPage().verifyPasswordError(),"Password is required.","Error message is not visible");
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordError(),"Password is required.","Error message is not visible");
    }

    @And("I select gender {string}")
    public void iSelectGender(String arg0) {

        new RegisterPage().selectGender("female");
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String arg0) {
        new RegisterPage().enterFirstName("Aarti");
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String arg0) {
        new RegisterPage().enterLastName("Doshi");
    }

    @And("I select date of birth day {string}")
    public void iSelectDateOfBirthDay(String arg0) {
        new RegisterPage().dateOfBirthDay("12");
    }

    @And("I select date of birth month {string}")
    public void iSelectDateOfBirthMonth(String arg0) {
        new RegisterPage().dateOfBirthMonth("January");

    }

    @And("I select date of birth year {string}")
    public void iSelectDateOfBirthYear(String arg0) {
        new RegisterPage().dateOfBirthYear("1980");
    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String arg0) {
        new RegisterPage().enterEmail("ada123@gmail.com");
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String arg0) {
        new RegisterPage().enterPassword("Helloworld");
    }

    @And("I enter the confrim password {string}")
    public void iEnterTheConfrimPassword(String arg0) {
        new RegisterPage().enterConfirmPassword("Helloworld");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompleteMessage(),"Your registration completed","Registration is not completed");
    }

    @And("I enter the confirm password {string}")
    public void iEnterTheConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword );
    }
}
