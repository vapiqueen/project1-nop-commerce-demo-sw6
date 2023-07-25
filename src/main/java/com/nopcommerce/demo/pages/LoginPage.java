package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage () {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @CacheLookup
    @FindBy( css = ".ico-login")
    WebElement logintext;
    public String verifyWelcomeText() {
        log.info("Verifying welcome text is displayed:" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email) {
        log.info("Enter your email address:" + emailField.toString());
        sendTextToElement(emailField, email);


    }

    public void enterPassword(String password) {
        log.info("Entering password in password field:" + passwordField.toString());
        sendTextToElement(passwordField, password);


    }

    public void clickOnLoginButton() {
        log.info("Clicking on login button:" + loginButton.toString());
        clickOnElement(loginButton);


    }

    public String verifyErrorMessage() {
        log.info("Verifying Error Message:" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String verifyLogoutLinkIsDisplayed() {
        log.info("Verifying logout link is displayed:" + logout.toString());
        return getTextFromElement(logout);
    }

    public void clickOnLogoutLink() {
        log.info("Clicking on logout link:" + logout.toString());
        clickOnElement(logout);
    }
    public String verifyLoginLinkIsDisplayed(){
        log.info("Verifying loging link is displayed:"+logintext.toString());
        return getTextFromElement (logintext);
    }
}
