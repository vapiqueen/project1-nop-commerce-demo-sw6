package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage () {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;



    public String verifyRegisterText() {
        log.info("Verifying register text is displayed:" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void selectGender(String maleOrFemale) {
        log.info("selecting gender:");
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }

    public void enterFirstName(String firstName) {
        log.info("Entering  first name:" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Entering  last name:" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void dateOfBirthDay(String day) {
        log.info("Entering  date of birth day:" + dateOfBirthDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        log.info("Entering  date of birth month:" + monthOfBirthDay.toString());
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
    }

    public void dateOfBirthYear(String year) {
        log.info("Entering  date of birth year:" + yearOfBirthDay.toString());
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
    }
    public void enterEmail(String email) {
        log.info("Entering  email address:" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Entering password:" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Entering confirm password:" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Clicking on register button:" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        log.info("Verifying first name error:" + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        log.info("Verifying last name error:" + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        log.info("Verifying password error:" + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        log.info("Verifying :" + confirmPasswordField.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        log.info("Verifying email error:" + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        log.info("Verifying registration is complete message:" + verifyRegistration.toString());
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        log.info("Clicking on continue tab:" + continueTab.toString());
        clickOnElement(continueTab);
    }
}

